package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.IndicatorValueEntity;

public interface IndicatorValueRepositoryCustom {
    List<IndicatorValueEntity> findAllOrdered();
    long countAll();
    List<IndicatorValueEntity> findByIndicatorId(Long indicatorId);
    List<IndicatorValueEntity> findByActionId(Long actionId);
    List<IndicatorValueEntity> findByDataSourceId(Long dataSourceId);
    List<IndicatorValueEntity> findByValidationStatusId(Long validationStatusId);
    List<IndicatorValueEntity> findByRecordedById(Long recordedById);
    List<IndicatorValueEntity> findByValidatedById(Long validatedById);
}
