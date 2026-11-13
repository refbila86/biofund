package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long>, RoleRepositoryCustom {}
