package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ValidationStatusEntity;
import mz.co.biodiversity.repository.ValidationStatusRepository;
import mz.co.biodiversity.service.IValidationStatusService;
@Service
@Transactional
public class ValidationStatusServiceImpl implements IValidationStatusService {
    private final ValidationStatusRepository repository;
    public ValidationStatusServiceImpl(ValidationStatusRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ValidationStatusEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ValidationStatusEntity> findById(Long id) { return repository.findById(id); }
    @Override public ValidationStatusEntity save(ValidationStatusEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
