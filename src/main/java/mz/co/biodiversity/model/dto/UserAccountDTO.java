package mz.co.biodiversity.model.dto;

import java.io.Serializable;
import mz.co.biodiversity.model.entity.UserAccountEntity;

public class UserAccountDTO implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long institution_id;
	private Long role_id;
	private String name;
	private String email;
	private String username;
	private String status;

	public UserAccountDTO()
	{
	}

	public UserAccountDTO(UserAccountEntity e)
	{
		this.id = e.getId();
		this.institution_id = e.getInstitution_id();
		this.role_id = e.getRole_id();
		this.name = e.getName();
		this.email = e.getEmail();
		this.username = e.getUsername();
		this.status = e.getStatus();
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getInstitution_id()
	{
		return institution_id;
	}

	public void setInstitution_id(Long institution_id)
	{
		this.institution_id = institution_id;
	}

	public Long getRole_id()
	{
		return role_id;
	}

	public void setRole_id(Long role_id)
	{
		this.role_id = role_id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getRoleLabel()
	{
		if (role_id == null)
			return "Sessão ativa";
		if (role_id == 1L)
			return "System Administrator";
		if (role_id == 2L)
			return "Institution Admin";
		if (role_id == 3L)
			return "User";
		return "Role " + role_id;
	}
}