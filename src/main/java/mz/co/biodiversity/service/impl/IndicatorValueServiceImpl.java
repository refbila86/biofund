package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.IndicatorValueEntity;
import mz.co.biodiversity.repository.IndicatorValueRepository;
import mz.co.biodiversity.service.IIndicatorValueService;
@Service
@Transactional
public class IndicatorValueServiceImpl implements IIndicatorValueService {
    private final IndicatorValueRepository repository;
    public IndicatorValueServiceImpl(IndicatorValueRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<IndicatorValueEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<IndicatorValueEntity> findById(Long id) { return repository.findById(id); }
    @Override public IndicatorValueEntity save(IndicatorValueEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
