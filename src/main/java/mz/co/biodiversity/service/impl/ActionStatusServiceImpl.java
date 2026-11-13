package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ActionStatusEntity;
import mz.co.biodiversity.repository.ActionStatusRepository;
import mz.co.biodiversity.service.IActionStatusService;
@Service
@Transactional
public class ActionStatusServiceImpl implements IActionStatusService {
    private final ActionStatusRepository repository;
    public ActionStatusServiceImpl(ActionStatusRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ActionStatusEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ActionStatusEntity> findById(Long id) { return repository.findById(id); }
    @Override public ActionStatusEntity save(ActionStatusEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
