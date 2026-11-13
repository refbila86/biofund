package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.RoleEntity;
import mz.co.biodiversity.repository.RoleRepositoryCustom;

@Repository
public class RoleRepositoryImpl implements RoleRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<RoleEntity> findAllOrdered() {
        return entityManager.createNamedQuery("RoleEntity.findAll", RoleEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("RoleEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<RoleEntity> findByCode(String code) {
        return entityManager.createNamedQuery("RoleEntity.findByCode", RoleEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<RoleEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("RoleEntity.findByActive", RoleEntity.class)
                .setParameter("active", active)
                .getResultList();
    }
}
