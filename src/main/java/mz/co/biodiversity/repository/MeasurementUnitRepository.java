package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.MeasurementUnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MeasurementUnitRepository extends JpaRepository<MeasurementUnitEntity, Long>, MeasurementUnitRepositoryCustom {}
