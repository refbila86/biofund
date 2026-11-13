package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.LocationEntity;
import mz.co.biodiversity.repository.LocationRepository;
import mz.co.biodiversity.service.ILocationService;
@Service
@Transactional
public class LocationServiceImpl implements ILocationService {
    private final LocationRepository repository;
    public LocationServiceImpl(LocationRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<LocationEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<LocationEntity> findById(Long id) { return repository.findById(id); }
    @Override public LocationEntity save(LocationEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
