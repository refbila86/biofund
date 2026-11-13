package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ActionBudgetEntity;

public interface ActionBudgetRepositoryCustom {
    List<ActionBudgetEntity> findAllOrdered();
    long countAll();
    List<ActionBudgetEntity> findByActionId(Long actionId);
    List<ActionBudgetEntity> findByFundingSourceId(Long fundingSourceId);
}
