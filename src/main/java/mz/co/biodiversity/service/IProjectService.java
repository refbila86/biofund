package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ProjectEntity;
public interface IProjectService {
    List<ProjectEntity> findAll();
    Optional<ProjectEntity> findById(Long id);
    ProjectEntity save(ProjectEntity entity);
    void deleteById(Long id);
}
