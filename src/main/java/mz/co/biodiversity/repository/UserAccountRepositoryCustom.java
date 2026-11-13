package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.UserAccountEntity;

public interface UserAccountRepositoryCustom {
    List<UserAccountEntity> findAllOrdered();
    long countAll();
    List<UserAccountEntity> findByInstitutionId(Long institutionId);
    List<UserAccountEntity> findByRoleId(Long roleId);
}
