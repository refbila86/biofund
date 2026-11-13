package mz.co.biodiversity.repository;

import mz.co.biodiversity.model.entity.ActionBudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionBudgetRepository extends JpaRepository<ActionBudgetEntity, Long>, ActionBudgetRepositoryCustom
{
}
