package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.SectorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SectorRepository extends JpaRepository<SectorEntity, Long>, SectorRepositoryCustom {}
