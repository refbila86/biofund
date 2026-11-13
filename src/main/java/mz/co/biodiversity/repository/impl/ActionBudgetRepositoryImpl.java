package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ActionBudgetEntity;
import mz.co.biodiversity.repository.ActionBudgetRepositoryCustom;

@Repository
public class ActionBudgetRepositoryImpl implements ActionBudgetRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ActionBudgetEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ActionBudgetEntity.findAll", ActionBudgetEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ActionBudgetEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ActionBudgetEntity> findByActionId(Long actionId) {
        return entityManager.createNamedQuery("ActionBudgetEntity.findByActionId", ActionBudgetEntity.class)
                .setParameter("actionId", actionId)
                .getResultList();
    }

    @Override
    public List<ActionBudgetEntity> findByFundingSourceId(Long fundingSourceId) {
        return entityManager.createNamedQuery("ActionBudgetEntity.findByFundingSourceId", ActionBudgetEntity.class)
                .setParameter("fundingSourceId", fundingSourceId)
                .getResultList();
    }
}
