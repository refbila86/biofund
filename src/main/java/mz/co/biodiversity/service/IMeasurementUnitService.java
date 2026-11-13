package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.MeasurementUnitEntity;
public interface IMeasurementUnitService {
    List<MeasurementUnitEntity> findAll();
    Optional<MeasurementUnitEntity> findById(Long id);
    MeasurementUnitEntity save(MeasurementUnitEntity entity);
    void deleteById(Long id);
}
