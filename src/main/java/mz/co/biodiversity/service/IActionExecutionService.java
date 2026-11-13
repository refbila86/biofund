package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ActionExecutionEntity;
public interface IActionExecutionService {
    List<ActionExecutionEntity> findAll();
    Optional<ActionExecutionEntity> findById(Long id);
    ActionExecutionEntity save(ActionExecutionEntity entity);
    void deleteById(Long id);
}
