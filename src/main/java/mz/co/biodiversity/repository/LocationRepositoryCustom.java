package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.LocationEntity;

public interface LocationRepositoryCustom {
    List<LocationEntity> findAllOrdered();
    long countAll();
    List<LocationEntity> findByCode(String code);
    List<LocationEntity> findByActive(Boolean active);
}
