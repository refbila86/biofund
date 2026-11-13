package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ActionExecutionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ActionExecutionRepository extends JpaRepository<ActionExecutionEntity, Long>, ActionExecutionRepositoryCustom {}
