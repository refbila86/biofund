package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.AuditHistoryEntity;
import mz.co.biodiversity.repository.AuditHistoryRepository;
import mz.co.biodiversity.service.IAuditHistoryService;
@Service
@Transactional
public class AuditHistoryServiceImpl implements IAuditHistoryService {
    private final AuditHistoryRepository repository;
    public AuditHistoryServiceImpl(AuditHistoryRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<AuditHistoryEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<AuditHistoryEntity> findById(Long id) { return repository.findById(id); }
    @Override public AuditHistoryEntity save(AuditHistoryEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
