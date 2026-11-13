package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.DataSourceEntity;
import mz.co.biodiversity.repository.DataSourceRepository;
import mz.co.biodiversity.service.IDataSourceService;
@Service
@Transactional
public class DataSourceServiceImpl implements IDataSourceService {
    private final DataSourceRepository repository;
    public DataSourceServiceImpl(DataSourceRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<DataSourceEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<DataSourceEntity> findById(Long id) { return repository.findById(id); }
    @Override public DataSourceEntity save(DataSourceEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
