package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.LocationEntity;
import mz.co.biodiversity.repository.LocationRepositoryCustom;

@Repository
public class LocationRepositoryImpl implements LocationRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<LocationEntity> findAllOrdered() {
        return entityManager.createNamedQuery("LocationEntity.findAll", LocationEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("LocationEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<LocationEntity> findByCode(String code) {
        return entityManager.createNamedQuery("LocationEntity.findByCode", LocationEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<LocationEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("LocationEntity.findByActive", LocationEntity.class)
                .setParameter("active", active)
                .getResultList();
    }
}
