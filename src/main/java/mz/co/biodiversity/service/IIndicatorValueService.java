package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.IndicatorValueEntity;
public interface IIndicatorValueService {
    List<IndicatorValueEntity> findAll();
    Optional<IndicatorValueEntity> findById(Long id);
    IndicatorValueEntity save(IndicatorValueEntity entity);
    void deleteById(Long id);
}
