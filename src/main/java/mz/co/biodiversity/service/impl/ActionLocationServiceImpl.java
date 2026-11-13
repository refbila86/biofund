package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ActionLocationEntity;
import mz.co.biodiversity.repository.ActionLocationRepository;
import mz.co.biodiversity.service.IActionLocationService;
@Service
@Transactional
public class ActionLocationServiceImpl implements IActionLocationService {
    private final ActionLocationRepository repository;
    public ActionLocationServiceImpl(ActionLocationRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ActionLocationEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ActionLocationEntity> findById(Long id) { return repository.findById(id); }
    @Override public ActionLocationEntity save(ActionLocationEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
