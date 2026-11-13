package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.RoleEntity;

public interface RoleRepositoryCustom {
    List<RoleEntity> findAllOrdered();
    long countAll();
    List<RoleEntity> findByCode(String code);
    List<RoleEntity> findByActive(Boolean active);
}
