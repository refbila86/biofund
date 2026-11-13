package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.TargetEntity;

public interface TargetRepositoryCustom {
    List<TargetEntity> findAllOrdered();
    long countAll();
    List<TargetEntity> findByCode(String code);
    List<TargetEntity> findByActive(Boolean active);
    List<TargetEntity> findByStrategicInstrumentId(Long strategicInstrumentId);
}
