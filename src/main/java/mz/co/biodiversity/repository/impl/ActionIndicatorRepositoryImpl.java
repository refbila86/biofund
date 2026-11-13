package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ActionIndicatorEntity;
import mz.co.biodiversity.repository.ActionIndicatorRepositoryCustom;

@Repository
public class ActionIndicatorRepositoryImpl implements ActionIndicatorRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ActionIndicatorEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ActionIndicatorEntity.findAll", ActionIndicatorEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ActionIndicatorEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ActionIndicatorEntity> findByActionId(Long actionId) {
        return entityManager.createNamedQuery("ActionIndicatorEntity.findByActionId", ActionIndicatorEntity.class)
                .setParameter("actionId", actionId)
                .getResultList();
    }

    @Override
    public List<ActionIndicatorEntity> findByIndicatorId(Long indicatorId) {
        return entityManager.createNamedQuery("ActionIndicatorEntity.findByIndicatorId", ActionIndicatorEntity.class)
                .setParameter("indicatorId", indicatorId)
                .getResultList();
    }
}
