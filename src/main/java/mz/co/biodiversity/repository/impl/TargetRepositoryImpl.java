package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.TargetEntity;
import mz.co.biodiversity.repository.TargetRepositoryCustom;

@Repository
public class TargetRepositoryImpl implements TargetRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TargetEntity> findAllOrdered() {
        return entityManager.createNamedQuery("TargetEntity.findAll", TargetEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("TargetEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<TargetEntity> findByCode(String code) {
        return entityManager.createNamedQuery("TargetEntity.findByCode", TargetEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<TargetEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("TargetEntity.findByActive", TargetEntity.class)
                .setParameter("active", active)
                .getResultList();
    }

    @Override
    public List<TargetEntity> findByStrategicInstrumentId(Long strategicInstrumentId) {
        return entityManager.createNamedQuery("TargetEntity.findByStrategicInstrumentId", TargetEntity.class)
                .setParameter("strategicInstrumentId", strategicInstrumentId)
                .getResultList();
    }
}
