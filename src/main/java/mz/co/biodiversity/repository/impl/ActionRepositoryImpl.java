package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ActionEntity;
import mz.co.biodiversity.repository.ActionRepositoryCustom;

@Repository
public class ActionRepositoryImpl implements ActionRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ActionEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ActionEntity.findAll", ActionEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ActionEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ActionEntity> findByCode(String code) {
        return entityManager.createNamedQuery("ActionEntity.findByCode", ActionEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<ActionEntity> findByProjectId(Long projectId) {
        return entityManager.createNamedQuery("ActionEntity.findByProjectId", ActionEntity.class)
                .setParameter("projectId", projectId)
                .getResultList();
    }

    @Override
    public List<ActionEntity> findByInstitutionId(Long institutionId) {
        return entityManager.createNamedQuery("ActionEntity.findByInstitutionId", ActionEntity.class)
                .setParameter("institutionId", institutionId)
                .getResultList();
    }

    @Override
    public List<ActionEntity> findByInterventionTypeId(Long interventionTypeId) {
        return entityManager.createNamedQuery("ActionEntity.findByInterventionTypeId", ActionEntity.class)
                .setParameter("interventionTypeId", interventionTypeId)
                .getResultList();
    }

    @Override
    public List<ActionEntity> findByActionStatusId(Long actionStatusId) {
        return entityManager.createNamedQuery("ActionEntity.findByActionStatusId", ActionEntity.class)
                .setParameter("actionStatusId", actionStatusId)
                .getResultList();
    }

    @Override
    public List<ActionEntity> findByCreatedById(Long createdById) {
        return entityManager.createNamedQuery("ActionEntity.findByCreatedById", ActionEntity.class)
                .setParameter("createdById", createdById)
                .getResultList();
    }
}
