package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.StrategicInstrumentEntity;

public interface StrategicInstrumentRepositoryCustom {
    List<StrategicInstrumentEntity> findAllOrdered();
    long countAll();
    List<StrategicInstrumentEntity> findByActive(Boolean active);
}
