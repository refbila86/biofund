package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.UserAccountEntity;
import mz.co.biodiversity.repository.UserAccountRepositoryCustom;

@Repository
public class UserAccountRepositoryImpl implements UserAccountRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserAccountEntity> findAllOrdered() {
        return entityManager.createNamedQuery("UserAccountEntity.findAll", UserAccountEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("UserAccountEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<UserAccountEntity> findByInstitutionId(Long institutionId) {
        return entityManager.createNamedQuery("UserAccountEntity.findByInstitutionId", UserAccountEntity.class)
                .setParameter("institutionId", institutionId)
                .getResultList();
    }

    @Override
    public List<UserAccountEntity> findByRoleId(Long roleId) {
        return entityManager.createNamedQuery("UserAccountEntity.findByRoleId", UserAccountEntity.class)
                .setParameter("roleId", roleId)
                .getResultList();
    }
    
    
}
