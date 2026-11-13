package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.IndicatorTargetPeriodEntity;
public interface IIndicatorTargetPeriodService {
    List<IndicatorTargetPeriodEntity> findAll();
    Optional<IndicatorTargetPeriodEntity> findById(Long id);
    IndicatorTargetPeriodEntity save(IndicatorTargetPeriodEntity entity);
    void deleteById(Long id);
}
