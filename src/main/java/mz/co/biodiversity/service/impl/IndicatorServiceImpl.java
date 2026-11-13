package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.IndicatorEntity;
import mz.co.biodiversity.repository.IndicatorRepository;
import mz.co.biodiversity.service.IIndicatorService;
@Service
@Transactional
public class IndicatorServiceImpl implements IIndicatorService {
    private final IndicatorRepository repository;
    public IndicatorServiceImpl(IndicatorRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<IndicatorEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<IndicatorEntity> findById(Long id) { return repository.findById(id); }
    @Override public IndicatorEntity save(IndicatorEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
