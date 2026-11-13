package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ImportBatchEntity;
import mz.co.biodiversity.repository.ImportBatchRepository;
import mz.co.biodiversity.service.IImportBatchService;
@Service
@Transactional
public class ImportBatchServiceImpl implements IImportBatchService {
    private final ImportBatchRepository repository;
    public ImportBatchServiceImpl(ImportBatchRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ImportBatchEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ImportBatchEntity> findById(Long id) { return repository.findById(id); }
    @Override public ImportBatchEntity save(ImportBatchEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
