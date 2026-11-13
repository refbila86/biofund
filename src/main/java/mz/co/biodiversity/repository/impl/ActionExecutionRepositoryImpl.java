package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ActionExecutionEntity;
import mz.co.biodiversity.repository.ActionExecutionRepositoryCustom;

@Repository
public class ActionExecutionRepositoryImpl implements ActionExecutionRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ActionExecutionEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ActionExecutionEntity.findAll", ActionExecutionEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ActionExecutionEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ActionExecutionEntity> findByActionId(Long actionId) {
        return entityManager.createNamedQuery("ActionExecutionEntity.findByActionId", ActionExecutionEntity.class)
                .setParameter("actionId", actionId)
                .getResultList();
    }

    @Override
    public List<ActionExecutionEntity> findByFundingSourceId(Long fundingSourceId) {
        return entityManager.createNamedQuery("ActionExecutionEntity.findByFundingSourceId", ActionExecutionEntity.class)
                .setParameter("fundingSourceId", fundingSourceId)
                .getResultList();
    }

    @Override
    public List<ActionExecutionEntity> findByValidationStatusId(Long validationStatusId) {
        return entityManager.createNamedQuery("ActionExecutionEntity.findByValidationStatusId", ActionExecutionEntity.class)
                .setParameter("validationStatusId", validationStatusId)
                .getResultList();
    }

    @Override
    public List<ActionExecutionEntity> findByRecordedById(Long recordedById) {
        return entityManager.createNamedQuery("ActionExecutionEntity.findByRecordedById", ActionExecutionEntity.class)
                .setParameter("recordedById", recordedById)
                .getResultList();
    }

    @Override
    public List<ActionExecutionEntity> findByValidatedById(Long validatedById) {
        return entityManager.createNamedQuery("ActionExecutionEntity.findByValidatedById", ActionExecutionEntity.class)
                .setParameter("validatedById", validatedById)
                .getResultList();
    }
}
