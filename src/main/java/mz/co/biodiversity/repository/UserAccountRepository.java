package mz.co.biodiversity.repository;

import java.util.Optional;
import mz.co.biodiversity.model.entity.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Long>, UserAccountRepositoryCustom
{

	Optional<UserAccountEntity> findByEmail(String email);

	Optional<UserAccountEntity> findByUsername(String username);

}
