package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ActionBiodiversityTaggingEntity;
import mz.co.biodiversity.repository.ActionBiodiversityTaggingRepository;
import mz.co.biodiversity.service.IActionBiodiversityTaggingService;
@Service
@Transactional
public class ActionBiodiversityTaggingServiceImpl implements IActionBiodiversityTaggingService {
    private final ActionBiodiversityTaggingRepository repository;
    public ActionBiodiversityTaggingServiceImpl(ActionBiodiversityTaggingRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ActionBiodiversityTaggingEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ActionBiodiversityTaggingEntity> findById(Long id) { return repository.findById(id); }
    @Override public ActionBiodiversityTaggingEntity save(ActionBiodiversityTaggingEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
