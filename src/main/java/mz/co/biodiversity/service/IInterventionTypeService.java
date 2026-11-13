package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.InterventionTypeEntity;
public interface IInterventionTypeService {
    List<InterventionTypeEntity> findAll();
    Optional<InterventionTypeEntity> findById(Long id);
    InterventionTypeEntity save(InterventionTypeEntity entity);
    void deleteById(Long id);
}
