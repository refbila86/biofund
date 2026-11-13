package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ActionIndicatorEntity;
import mz.co.biodiversity.repository.ActionIndicatorRepository;
import mz.co.biodiversity.service.IActionIndicatorService;
@Service
@Transactional
public class ActionIndicatorServiceImpl implements IActionIndicatorService {
    private final ActionIndicatorRepository repository;
    public ActionIndicatorServiceImpl(ActionIndicatorRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ActionIndicatorEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ActionIndicatorEntity> findById(Long id) { return repository.findById(id); }
    @Override public ActionIndicatorEntity save(ActionIndicatorEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
