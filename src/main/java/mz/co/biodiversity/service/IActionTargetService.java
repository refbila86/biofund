package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ActionTargetEntity;
public interface IActionTargetService {
    List<ActionTargetEntity> findAll();
    Optional<ActionTargetEntity> findById(Long id);
    ActionTargetEntity save(ActionTargetEntity entity);
    void deleteById(Long id);
}
