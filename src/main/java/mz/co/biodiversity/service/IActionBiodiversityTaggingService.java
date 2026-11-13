package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ActionBiodiversityTaggingEntity;
public interface IActionBiodiversityTaggingService {
    List<ActionBiodiversityTaggingEntity> findAll();
    Optional<ActionBiodiversityTaggingEntity> findById(Long id);
    ActionBiodiversityTaggingEntity save(ActionBiodiversityTaggingEntity entity);
    void deleteById(Long id);
}
