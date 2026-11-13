package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.EvidenceEntity;
import mz.co.biodiversity.repository.EvidenceRepositoryCustom;

@Repository
public class EvidenceRepositoryImpl implements EvidenceRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<EvidenceEntity> findAllOrdered() {
        return entityManager.createNamedQuery("EvidenceEntity.findAll", EvidenceEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("EvidenceEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<EvidenceEntity> findByActionId(Long actionId) {
        return entityManager.createNamedQuery("EvidenceEntity.findByActionId", EvidenceEntity.class)
                .setParameter("actionId", actionId)
                .getResultList();
    }

    @Override
    public List<EvidenceEntity> findByUploadedById(Long uploadedById) {
        return entityManager.createNamedQuery("EvidenceEntity.findByUploadedById", EvidenceEntity.class)
                .setParameter("uploadedById", uploadedById)
                .getResultList();
    }
}
