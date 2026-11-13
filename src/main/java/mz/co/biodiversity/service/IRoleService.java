package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.RoleEntity;
public interface IRoleService {
    List<RoleEntity> findAll();
    Optional<RoleEntity> findById(Long id);
    RoleEntity save(RoleEntity entity);
    void deleteById(Long id);
}
