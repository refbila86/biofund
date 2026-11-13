package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.StrategicInstrumentEntity;
public interface IStrategicInstrumentService {
    List<StrategicInstrumentEntity> findAll();
    Optional<StrategicInstrumentEntity> findById(Long id);
    StrategicInstrumentEntity save(StrategicInstrumentEntity entity);
    void deleteById(Long id);
}
