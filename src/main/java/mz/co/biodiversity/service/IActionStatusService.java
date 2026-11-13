package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ActionStatusEntity;
public interface IActionStatusService {
    List<ActionStatusEntity> findAll();
    Optional<ActionStatusEntity> findById(Long id);
    ActionStatusEntity save(ActionStatusEntity entity);
    void deleteById(Long id);
}
