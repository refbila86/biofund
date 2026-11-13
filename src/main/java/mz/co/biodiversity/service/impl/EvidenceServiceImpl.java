package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.EvidenceEntity;
import mz.co.biodiversity.repository.EvidenceRepository;
import mz.co.biodiversity.service.IEvidenceService;
@Service
@Transactional
public class EvidenceServiceImpl implements IEvidenceService {
    private final EvidenceRepository repository;
    public EvidenceServiceImpl(EvidenceRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<EvidenceEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<EvidenceEntity> findById(Long id) { return repository.findById(id); }
    @Override public EvidenceEntity save(EvidenceEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
