package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.IndicatorValueEntity;
import mz.co.biodiversity.repository.IndicatorValueRepositoryCustom;

@Repository
public class IndicatorValueRepositoryImpl implements IndicatorValueRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<IndicatorValueEntity> findAllOrdered() {
        return entityManager.createNamedQuery("IndicatorValueEntity.findAll", IndicatorValueEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("IndicatorValueEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<IndicatorValueEntity> findByIndicatorId(Long indicatorId) {
        return entityManager.createNamedQuery("IndicatorValueEntity.findByIndicatorId", IndicatorValueEntity.class)
                .setParameter("indicatorId", indicatorId)
                .getResultList();
    }

    @Override
    public List<IndicatorValueEntity> findByActionId(Long actionId) {
        return entityManager.createNamedQuery("IndicatorValueEntity.findByActionId", IndicatorValueEntity.class)
                .setParameter("actionId", actionId)
                .getResultList();
    }

    @Override
    public List<IndicatorValueEntity> findByDataSourceId(Long dataSourceId) {
        return entityManager.createNamedQuery("IndicatorValueEntity.findByDataSourceId", IndicatorValueEntity.class)
                .setParameter("dataSourceId", dataSourceId)
                .getResultList();
    }

    @Override
    public List<IndicatorValueEntity> findByValidationStatusId(Long validationStatusId) {
        return entityManager.createNamedQuery("IndicatorValueEntity.findByValidationStatusId", IndicatorValueEntity.class)
                .setParameter("validationStatusId", validationStatusId)
                .getResultList();
    }

    @Override
    public List<IndicatorValueEntity> findByRecordedById(Long recordedById) {
        return entityManager.createNamedQuery("IndicatorValueEntity.findByRecordedById", IndicatorValueEntity.class)
                .setParameter("recordedById", recordedById)
                .getResultList();
    }

    @Override
    public List<IndicatorValueEntity> findByValidatedById(Long validatedById) {
        return entityManager.createNamedQuery("IndicatorValueEntity.findByValidatedById", IndicatorValueEntity.class)
                .setParameter("validatedById", validatedById)
                .getResultList();
    }
}
