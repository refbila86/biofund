package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ActionTargetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ActionTargetRepository extends JpaRepository<ActionTargetEntity, Long>, ActionTargetRepositoryCustom {}
