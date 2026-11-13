package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.InterventionTypeEntity;
import mz.co.biodiversity.repository.InterventionTypeRepositoryCustom;

@Repository
public class InterventionTypeRepositoryImpl implements InterventionTypeRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<InterventionTypeEntity> findAllOrdered() {
        return entityManager.createNamedQuery("InterventionTypeEntity.findAll", InterventionTypeEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("InterventionTypeEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<InterventionTypeEntity> findByCode(String code) {
        return entityManager.createNamedQuery("InterventionTypeEntity.findByCode", InterventionTypeEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<InterventionTypeEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("InterventionTypeEntity.findByActive", InterventionTypeEntity.class)
                .setParameter("active", active)
                .getResultList();
    }
}
