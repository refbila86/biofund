package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.IndicatorEntity;

public interface IndicatorRepositoryCustom {
    List<IndicatorEntity> findAllOrdered();
    long countAll();
    List<IndicatorEntity> findByCode(String code);
    List<IndicatorEntity> findByActive(Boolean active);
    List<IndicatorEntity> findByTargetId(Long targetId);
    List<IndicatorEntity> findByDataSourceId(Long dataSourceId);
    List<IndicatorEntity> findByResponsibleInstitutionId(Long responsibleInstitutionId);
    List<IndicatorEntity> findByMeasurementUnitId(Long measurementUnitId);
}
