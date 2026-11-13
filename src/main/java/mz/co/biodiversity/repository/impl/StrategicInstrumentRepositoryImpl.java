package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.StrategicInstrumentEntity;
import mz.co.biodiversity.repository.StrategicInstrumentRepositoryCustom;

@Repository
public class StrategicInstrumentRepositoryImpl implements StrategicInstrumentRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<StrategicInstrumentEntity> findAllOrdered() {
        return entityManager.createNamedQuery("StrategicInstrumentEntity.findAll", StrategicInstrumentEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("StrategicInstrumentEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<StrategicInstrumentEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("StrategicInstrumentEntity.findByActive", StrategicInstrumentEntity.class)
                .setParameter("active", active)
                .getResultList();
    }
}
