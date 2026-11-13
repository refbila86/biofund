package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ActionStatusEntity;
import mz.co.biodiversity.repository.ActionStatusRepositoryCustom;

@Repository
public class ActionStatusRepositoryImpl implements ActionStatusRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ActionStatusEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ActionStatusEntity.findAll", ActionStatusEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ActionStatusEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ActionStatusEntity> findByCode(String code) {
        return entityManager.createNamedQuery("ActionStatusEntity.findByCode", ActionStatusEntity.class)
                .setParameter("code", code)
                .getResultList();
    }
}
