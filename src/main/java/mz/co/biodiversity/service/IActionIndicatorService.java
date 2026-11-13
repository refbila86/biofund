package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ActionIndicatorEntity;
public interface IActionIndicatorService {
    List<ActionIndicatorEntity> findAll();
    Optional<ActionIndicatorEntity> findById(Long id);
    ActionIndicatorEntity save(ActionIndicatorEntity entity);
    void deleteById(Long id);
}
