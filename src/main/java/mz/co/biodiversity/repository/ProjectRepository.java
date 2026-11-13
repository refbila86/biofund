package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long>, ProjectRepositoryCustom {}
