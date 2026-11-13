package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ActionBiodiversityTaggingEntity;
import mz.co.biodiversity.repository.ActionBiodiversityTaggingRepositoryCustom;

@Repository
public class ActionBiodiversityTaggingRepositoryImpl implements ActionBiodiversityTaggingRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ActionBiodiversityTaggingEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ActionBiodiversityTaggingEntity.findAll", ActionBiodiversityTaggingEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ActionBiodiversityTaggingEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ActionBiodiversityTaggingEntity> findByActionId(Long actionId) {
        return entityManager.createNamedQuery("ActionBiodiversityTaggingEntity.findByActionId", ActionBiodiversityTaggingEntity.class)
                .setParameter("actionId", actionId)
                .getResultList();
    }

    @Override
    public List<ActionBiodiversityTaggingEntity> findByBiodiversityClassificationId(Long biodiversityClassificationId) {
        return entityManager.createNamedQuery("ActionBiodiversityTaggingEntity.findByBiodiversityClassificationId", ActionBiodiversityTaggingEntity.class)
                .setParameter("biodiversityClassificationId", biodiversityClassificationId)
                .getResultList();
    }

    @Override
    public List<ActionBiodiversityTaggingEntity> findByValidationStatusId(Long validationStatusId) {
        return entityManager.createNamedQuery("ActionBiodiversityTaggingEntity.findByValidationStatusId", ActionBiodiversityTaggingEntity.class)
                .setParameter("validationStatusId", validationStatusId)
                .getResultList();
    }

    @Override
    public List<ActionBiodiversityTaggingEntity> findByClassifiedById(Long classifiedById) {
        return entityManager.createNamedQuery("ActionBiodiversityTaggingEntity.findByClassifiedById", ActionBiodiversityTaggingEntity.class)
                .setParameter("classifiedById", classifiedById)
                .getResultList();
    }

    @Override
    public List<ActionBiodiversityTaggingEntity> findByValidatedById(Long validatedById) {
        return entityManager.createNamedQuery("ActionBiodiversityTaggingEntity.findByValidatedById", ActionBiodiversityTaggingEntity.class)
                .setParameter("validatedById", validatedById)
                .getResultList();
    }
}
