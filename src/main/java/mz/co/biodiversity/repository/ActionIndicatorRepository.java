package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ActionIndicatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ActionIndicatorRepository extends JpaRepository<ActionIndicatorEntity, Long>, ActionIndicatorRepositoryCustom {}
