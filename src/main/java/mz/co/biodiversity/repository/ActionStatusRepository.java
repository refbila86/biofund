package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ActionStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ActionStatusRepository extends JpaRepository<ActionStatusEntity, Long>, ActionStatusRepositoryCustom {}
