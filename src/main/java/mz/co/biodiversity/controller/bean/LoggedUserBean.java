package mz.co.biodiversity.controller.bean;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import mz.co.biodiversity.model.dto.UserAccountDTO;
import mz.co.biodiversity.model.entity.UserAccountEntity;
import mz.co.biodiversity.service.IUserAccountService;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Component("loggedUserBean")
@Scope("session")
public class LoggedUserBean implements Serializable
{
	private static final long serialVersionUID = 1L;

	private final IUserAccountService userAccountService;
	private UserAccountDTO cachedUser;

	public LoggedUserBean(IUserAccountService userAccountService)
	{
		this.userAccountService = userAccountService;
	}

	private UserAccountDTO getLoggedUser()
	{
		if (cachedUser != null)
		{
			return cachedUser;
		}

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth == null || !auth.isAuthenticated() || "anonymousUser".equals(auth.getPrincipal()))
		{
			return null;
		}

		String login = auth.getName();
		UserAccountEntity entity = userAccountService.findByEmail(login).orElse(null);

		if (entity == null)
		{
			entity = userAccountService.findByUsername(login).orElse(null);
		}

		if (entity != null)
		{
			cachedUser = new UserAccountDTO(entity);
		}
		return cachedUser;
	}

	public String getDisplayName()
	{
		UserAccountDTO user = getLoggedUser();
		if (user != null && user.getName() != null && !user.getName().isBlank())
		{
			return user.getName();
		}
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth != null ? auth.getName() : "";
	}

	public String getInitials()
	{
		String name = getDisplayName();
		if (name == null || name.isBlank())
		{
			return "U";
		}
		String[] parts = name.trim().split("\\s+");
		if (parts.length == 1)
		{
			return parts[0].substring(0, 1).toUpperCase();
		}
		return (parts[0].substring(0, 1) + parts[parts.length - 1].substring(0, 1)).toUpperCase();
	}

	public String getRoleLabel()
	{
		UserAccountDTO user = getLoggedUser();
		if (user != null)
		{
			return user.getRoleLabel();
		}
		return "Sessão ativa";
	}

	public String getEmail()
	{
		UserAccountDTO user = getLoggedUser();
		return user != null ? user.getEmail() : "";
	}
}