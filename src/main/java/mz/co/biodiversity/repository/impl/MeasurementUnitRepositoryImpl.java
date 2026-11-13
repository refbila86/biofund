package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.MeasurementUnitEntity;
import mz.co.biodiversity.repository.MeasurementUnitRepositoryCustom;

@Repository
public class MeasurementUnitRepositoryImpl implements MeasurementUnitRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<MeasurementUnitEntity> findAllOrdered() {
        return entityManager.createNamedQuery("MeasurementUnitEntity.findAll", MeasurementUnitEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("MeasurementUnitEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<MeasurementUnitEntity> findByCode(String code) {
        return entityManager.createNamedQuery("MeasurementUnitEntity.findByCode", MeasurementUnitEntity.class)
                .setParameter("code", code)
                .getResultList();
    }
}
