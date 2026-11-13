package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.SectorEntity;
import mz.co.biodiversity.repository.SectorRepository;
import mz.co.biodiversity.service.ISectorService;
@Service
@Transactional
public class SectorServiceImpl implements ISectorService {
    private final SectorRepository repository;
    public SectorServiceImpl(SectorRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<SectorEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<SectorEntity> findById(Long id) { return repository.findById(id); }
    @Override public SectorEntity save(SectorEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
