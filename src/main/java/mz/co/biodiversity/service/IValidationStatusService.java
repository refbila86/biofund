package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ValidationStatusEntity;
public interface IValidationStatusService {
    List<ValidationStatusEntity> findAll();
    Optional<ValidationStatusEntity> findById(Long id);
    ValidationStatusEntity save(ValidationStatusEntity entity);
    void deleteById(Long id);
}
