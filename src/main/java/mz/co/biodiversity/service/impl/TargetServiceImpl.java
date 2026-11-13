package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.TargetEntity;
import mz.co.biodiversity.repository.TargetRepository;
import mz.co.biodiversity.service.ITargetService;
@Service
@Transactional
public class TargetServiceImpl implements ITargetService {
    private final TargetRepository repository;
    public TargetServiceImpl(TargetRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<TargetEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<TargetEntity> findById(Long id) { return repository.findById(id); }
    @Override public TargetEntity save(TargetEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
