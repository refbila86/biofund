package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.IndicatorTargetPeriodEntity;
import mz.co.biodiversity.repository.IndicatorTargetPeriodRepository;
import mz.co.biodiversity.service.IIndicatorTargetPeriodService;
@Service
@Transactional
public class IndicatorTargetPeriodServiceImpl implements IIndicatorTargetPeriodService {
    private final IndicatorTargetPeriodRepository repository;
    public IndicatorTargetPeriodServiceImpl(IndicatorTargetPeriodRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<IndicatorTargetPeriodEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<IndicatorTargetPeriodEntity> findById(Long id) { return repository.findById(id); }
    @Override public IndicatorTargetPeriodEntity save(IndicatorTargetPeriodEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
