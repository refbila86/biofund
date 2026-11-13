package mz.co.biodiversity.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.UserAccountEntity;
import mz.co.biodiversity.repository.UserAccountRepository;
import mz.co.biodiversity.service.IUserAccountService;

@Service
@Transactional
public class UserAccountServiceImpl implements IUserAccountService
{
	private final UserAccountRepository userAccountRepository;

	public UserAccountServiceImpl(UserAccountRepository repository)
	{
		this.userAccountRepository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public List<UserAccountEntity> findAll()
	{
		return userAccountRepository.findAllOrdered();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<UserAccountEntity> findById(Long id)
	{
		return userAccountRepository.findById(id);
	}

	@Override
	public UserAccountEntity save(UserAccountEntity entity)
	{
		return userAccountRepository.save(entity);
	}

	@Override
	public void deleteById(Long id)
	{
		userAccountRepository.deleteById(id);
	}

	@Override
	public Optional<UserAccountEntity> findByEmail(String email)
	{
		return userAccountRepository.findByEmail(email);
	}

	@Override
	public Optional<UserAccountEntity> findByUsername(String username)
	{
		return userAccountRepository.findByUsername(username);
	}
}
