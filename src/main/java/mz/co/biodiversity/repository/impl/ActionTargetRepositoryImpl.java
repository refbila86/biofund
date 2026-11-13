package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ActionTargetEntity;
import mz.co.biodiversity.repository.ActionTargetRepositoryCustom;

@Repository
public class ActionTargetRepositoryImpl implements ActionTargetRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ActionTargetEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ActionTargetEntity.findAll", ActionTargetEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ActionTargetEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ActionTargetEntity> findByActionId(Long actionId) {
        return entityManager.createNamedQuery("ActionTargetEntity.findByActionId", ActionTargetEntity.class)
                .setParameter("actionId", actionId)
                .getResultList();
    }

    @Override
    public List<ActionTargetEntity> findByTargetId(Long targetId) {
        return entityManager.createNamedQuery("ActionTargetEntity.findByTargetId", ActionTargetEntity.class)
                .setParameter("targetId", targetId)
                .getResultList();
    }
}
