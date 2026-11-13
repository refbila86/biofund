package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ActionTargetEntity;
import mz.co.biodiversity.repository.ActionTargetRepository;
import mz.co.biodiversity.service.IActionTargetService;
@Service
@Transactional
public class ActionTargetServiceImpl implements IActionTargetService {
    private final ActionTargetRepository repository;
    public ActionTargetServiceImpl(ActionTargetRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ActionTargetEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ActionTargetEntity> findById(Long id) { return repository.findById(id); }
    @Override public ActionTargetEntity save(ActionTargetEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
