package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ActionBudgetEntity;
public interface IActionBudgetService {
    List<ActionBudgetEntity> findAll();
    Optional<ActionBudgetEntity> findById(Long id);
    ActionBudgetEntity save(ActionBudgetEntity entity);
    void deleteById(Long id);
}
