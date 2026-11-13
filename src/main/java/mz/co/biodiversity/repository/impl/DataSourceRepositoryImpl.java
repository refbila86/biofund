package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.DataSourceEntity;
import mz.co.biodiversity.repository.DataSourceRepositoryCustom;

@Repository
public class DataSourceRepositoryImpl implements DataSourceRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<DataSourceEntity> findAllOrdered() {
        return entityManager.createNamedQuery("DataSourceEntity.findAll", DataSourceEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("DataSourceEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<DataSourceEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("DataSourceEntity.findByActive", DataSourceEntity.class)
                .setParameter("active", active)
                .getResultList();
    }
}
