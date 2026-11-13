package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ImportBatchEntity;
import mz.co.biodiversity.repository.ImportBatchRepositoryCustom;

@Repository
public class ImportBatchRepositoryImpl implements ImportBatchRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ImportBatchEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ImportBatchEntity.findAll", ImportBatchEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ImportBatchEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ImportBatchEntity> findByStatus(String status) {
        return entityManager.createNamedQuery("ImportBatchEntity.findByStatus", ImportBatchEntity.class)
                .setParameter("status", status)
                .getResultList();
    }

    @Override
    public List<ImportBatchEntity> findByCreatedById(Long createdById) {
        return entityManager.createNamedQuery("ImportBatchEntity.findByCreatedById", ImportBatchEntity.class)
                .setParameter("createdById", createdById)
                .getResultList();
    }
}
