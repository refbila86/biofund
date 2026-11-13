package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.IndicatorEntity;
import mz.co.biodiversity.repository.IndicatorRepositoryCustom;

@Repository
public class IndicatorRepositoryImpl implements IndicatorRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<IndicatorEntity> findAllOrdered() {
        return entityManager.createNamedQuery("IndicatorEntity.findAll", IndicatorEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("IndicatorEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<IndicatorEntity> findByCode(String code) {
        return entityManager.createNamedQuery("IndicatorEntity.findByCode", IndicatorEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<IndicatorEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("IndicatorEntity.findByActive", IndicatorEntity.class)
                .setParameter("active", active)
                .getResultList();
    }

    @Override
    public List<IndicatorEntity> findByTargetId(Long targetId) {
        return entityManager.createNamedQuery("IndicatorEntity.findByTargetId", IndicatorEntity.class)
                .setParameter("targetId", targetId)
                .getResultList();
    }

    @Override
    public List<IndicatorEntity> findByDataSourceId(Long dataSourceId) {
        return entityManager.createNamedQuery("IndicatorEntity.findByDataSourceId", IndicatorEntity.class)
                .setParameter("dataSourceId", dataSourceId)
                .getResultList();
    }

    @Override
    public List<IndicatorEntity> findByResponsibleInstitutionId(Long responsibleInstitutionId) {
        return entityManager.createNamedQuery("IndicatorEntity.findByResponsibleInstitutionId", IndicatorEntity.class)
                .setParameter("responsibleInstitutionId", responsibleInstitutionId)
                .getResultList();
    }

    @Override
    public List<IndicatorEntity> findByMeasurementUnitId(Long measurementUnitId) {
        return entityManager.createNamedQuery("IndicatorEntity.findByMeasurementUnitId", IndicatorEntity.class)
                .setParameter("measurementUnitId", measurementUnitId)
                .getResultList();
    }
}
