package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.IndicatorEntity;
public interface IIndicatorService {
    List<IndicatorEntity> findAll();
    Optional<IndicatorEntity> findById(Long id);
    IndicatorEntity save(IndicatorEntity entity);
    void deleteById(Long id);
}
