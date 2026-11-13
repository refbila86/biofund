package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.MeasurementUnitEntity;

public interface MeasurementUnitRepositoryCustom {
    List<MeasurementUnitEntity> findAllOrdered();
    long countAll();
    List<MeasurementUnitEntity> findByCode(String code);
}
