package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ActionExecutionEntity;
import mz.co.biodiversity.repository.ActionExecutionRepository;
import mz.co.biodiversity.service.IActionExecutionService;
@Service
@Transactional
public class ActionExecutionServiceImpl implements IActionExecutionService {
    private final ActionExecutionRepository repository;
    public ActionExecutionServiceImpl(ActionExecutionRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ActionExecutionEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ActionExecutionEntity> findById(Long id) { return repository.findById(id); }
    @Override public ActionExecutionEntity save(ActionExecutionEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
