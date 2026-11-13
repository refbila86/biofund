package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.MeasurementUnitEntity;
import mz.co.biodiversity.repository.MeasurementUnitRepository;
import mz.co.biodiversity.service.IMeasurementUnitService;
@Service
@Transactional
public class MeasurementUnitServiceImpl implements IMeasurementUnitService {
    private final MeasurementUnitRepository repository;
    public MeasurementUnitServiceImpl(MeasurementUnitRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<MeasurementUnitEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<MeasurementUnitEntity> findById(Long id) { return repository.findById(id); }
    @Override public MeasurementUnitEntity save(MeasurementUnitEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
