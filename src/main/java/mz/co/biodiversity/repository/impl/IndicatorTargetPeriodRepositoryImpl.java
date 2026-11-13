package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.IndicatorTargetPeriodEntity;
import mz.co.biodiversity.repository.IndicatorTargetPeriodRepositoryCustom;

@Repository
public class IndicatorTargetPeriodRepositoryImpl implements IndicatorTargetPeriodRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<IndicatorTargetPeriodEntity> findAllOrdered() {
        return entityManager.createNamedQuery("IndicatorTargetPeriodEntity.findAll", IndicatorTargetPeriodEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("IndicatorTargetPeriodEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<IndicatorTargetPeriodEntity> findByIndicatorId(Long indicatorId) {
        return entityManager.createNamedQuery("IndicatorTargetPeriodEntity.findByIndicatorId", IndicatorTargetPeriodEntity.class)
                .setParameter("indicatorId", indicatorId)
                .getResultList();
    }
}
