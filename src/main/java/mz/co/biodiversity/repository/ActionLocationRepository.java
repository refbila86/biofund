package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ActionLocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ActionLocationRepository extends JpaRepository<ActionLocationEntity, Long>, ActionLocationRepositoryCustom {}
