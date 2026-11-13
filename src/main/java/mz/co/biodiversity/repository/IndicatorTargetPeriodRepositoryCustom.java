package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.IndicatorTargetPeriodEntity;

public interface IndicatorTargetPeriodRepositoryCustom {
    List<IndicatorTargetPeriodEntity> findAllOrdered();
    long countAll();
    List<IndicatorTargetPeriodEntity> findByIndicatorId(Long indicatorId);
}
