package mz.co.biodiversity.controller.bean;

import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.UserAccountEntity;
import mz.co.biodiversity.service.IUserAccountService;

@Component("userAccountBean")
@Scope("view")
public class UserAccountBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	private final IUserAccountService service;
	private UserAccountEntity selected = new UserAccountEntity();

	public UserAccountBean(IUserAccountService service)
	{
		this.service = service;
	}

	public List<UserAccountEntity> getItems()
	{
		return service.findAll();
	}

	public UserAccountEntity getSelected()
	{
		return selected;
	}

	public void setSelected(UserAccountEntity selected)
	{
		this.selected = selected;
	}

	public void prepareNew()
	{
		selected = new UserAccountEntity();
	}

	public void save()
	{
		selected = service.save(selected);
	}

	public void delete(Long id)
	{
		service.deleteById(id);
	}
}