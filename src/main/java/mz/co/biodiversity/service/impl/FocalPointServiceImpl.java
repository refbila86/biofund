package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.FocalPointEntity;
import mz.co.biodiversity.repository.FocalPointRepository;
import mz.co.biodiversity.service.IFocalPointService;
@Service
@Transactional
public class FocalPointServiceImpl implements IFocalPointService {
    private final FocalPointRepository repository;
    public FocalPointServiceImpl(FocalPointRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<FocalPointEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<FocalPointEntity> findById(Long id) { return repository.findById(id); }
    @Override public FocalPointEntity save(FocalPointEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
