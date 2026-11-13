package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ActionEntity;
public interface IActionService {
    List<ActionEntity> findAll();
    Optional<ActionEntity> findById(Long id);
    ActionEntity save(ActionEntity entity);
    void deleteById(Long id);
}
