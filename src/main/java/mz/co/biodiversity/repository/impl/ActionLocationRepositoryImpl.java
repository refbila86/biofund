package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ActionLocationEntity;
import mz.co.biodiversity.repository.ActionLocationRepositoryCustom;

@Repository
public class ActionLocationRepositoryImpl implements ActionLocationRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ActionLocationEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ActionLocationEntity.findAll", ActionLocationEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ActionLocationEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ActionLocationEntity> findByActionId(Long actionId) {
        return entityManager.createNamedQuery("ActionLocationEntity.findByActionId", ActionLocationEntity.class)
                .setParameter("actionId", actionId)
                .getResultList();
    }

    @Override
    public List<ActionLocationEntity> findByLocationId(Long locationId) {
        return entityManager.createNamedQuery("ActionLocationEntity.findByLocationId", ActionLocationEntity.class)
                .setParameter("locationId", locationId)
                .getResultList();
    }
}
