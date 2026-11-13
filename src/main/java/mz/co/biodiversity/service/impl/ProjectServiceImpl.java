package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ProjectEntity;
import mz.co.biodiversity.repository.ProjectRepository;
import mz.co.biodiversity.service.IProjectService;
@Service
@Transactional
public class ProjectServiceImpl implements IProjectService {
    private final ProjectRepository repository;
    public ProjectServiceImpl(ProjectRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ProjectEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ProjectEntity> findById(Long id) { return repository.findById(id); }
    @Override public ProjectEntity save(ProjectEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
