package mz.co.biodiversity.service;

import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.UserAccountEntity;

public interface IUserAccountService
{
	List<UserAccountEntity> findAll();

	Optional<UserAccountEntity> findById(Long id);

	UserAccountEntity save(UserAccountEntity entity);

	void deleteById(Long id);
	
	Optional<UserAccountEntity> findByEmail(String email);
	
	Optional<UserAccountEntity> findByUsername(String username);
}
