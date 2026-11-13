package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.InstitutionEntity;
import mz.co.biodiversity.repository.InstitutionRepository;
import mz.co.biodiversity.service.IInstitutionService;
@Service
@Transactional
public class InstitutionServiceImpl implements IInstitutionService {
    private final InstitutionRepository repository;
    public InstitutionServiceImpl(InstitutionRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<InstitutionEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<InstitutionEntity> findById(Long id) { return repository.findById(id); }
    @Override public InstitutionEntity save(InstitutionEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
