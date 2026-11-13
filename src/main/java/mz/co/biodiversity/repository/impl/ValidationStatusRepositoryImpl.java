package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ValidationStatusEntity;
import mz.co.biodiversity.repository.ValidationStatusRepositoryCustom;

@Repository
public class ValidationStatusRepositoryImpl implements ValidationStatusRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ValidationStatusEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ValidationStatusEntity.findAll", ValidationStatusEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ValidationStatusEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ValidationStatusEntity> findByCode(String code) {
        return entityManager.createNamedQuery("ValidationStatusEntity.findByCode", ValidationStatusEntity.class)
                .setParameter("code", code)
                .getResultList();
    }
}
