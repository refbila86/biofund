package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.AuditHistoryEntity;
import mz.co.biodiversity.repository.AuditHistoryRepositoryCustom;

@Repository
public class AuditHistoryRepositoryImpl implements AuditHistoryRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AuditHistoryEntity> findAllOrdered() {
        return entityManager.createNamedQuery("AuditHistoryEntity.findAll", AuditHistoryEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("AuditHistoryEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<AuditHistoryEntity> findByUserId(Long userId) {
        return entityManager.createNamedQuery("AuditHistoryEntity.findByUserId", AuditHistoryEntity.class)
                .setParameter("userId", userId)
                .getResultList();
    }
}
