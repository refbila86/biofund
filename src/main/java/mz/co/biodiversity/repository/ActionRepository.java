package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ActionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ActionRepository extends JpaRepository<ActionEntity, Long>, ActionRepositoryCustom {}
