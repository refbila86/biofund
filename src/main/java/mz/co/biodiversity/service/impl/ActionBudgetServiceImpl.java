package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ActionBudgetEntity;
import mz.co.biodiversity.repository.ActionBudgetRepository;
import mz.co.biodiversity.service.IActionBudgetService;
@Service
@Transactional
public class ActionBudgetServiceImpl implements IActionBudgetService {
    private final ActionBudgetRepository repository;
    public ActionBudgetServiceImpl(ActionBudgetRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ActionBudgetEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ActionBudgetEntity> findById(Long id) { return repository.findById(id); }
    @Override public ActionBudgetEntity save(ActionBudgetEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
