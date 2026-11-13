package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.InterventionTypeEntity;
import mz.co.biodiversity.repository.InterventionTypeRepository;
import mz.co.biodiversity.service.IInterventionTypeService;
@Service
@Transactional
public class InterventionTypeServiceImpl implements IInterventionTypeService {
    private final InterventionTypeRepository repository;
    public InterventionTypeServiceImpl(InterventionTypeRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<InterventionTypeEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<InterventionTypeEntity> findById(Long id) { return repository.findById(id); }
    @Override public InterventionTypeEntity save(InterventionTypeEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
