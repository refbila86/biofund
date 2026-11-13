package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ActionEntity;
import mz.co.biodiversity.repository.ActionRepository;
import mz.co.biodiversity.service.IActionService;
@Service
@Transactional
public class ActionServiceImpl implements IActionService {
    private final ActionRepository repository;
    public ActionServiceImpl(ActionRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ActionEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ActionEntity> findById(Long id) { return repository.findById(id); }
    @Override public ActionEntity save(ActionEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
