package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.SectorEntity;

public interface SectorRepositoryCustom {
    List<SectorEntity> findAllOrdered();
    long countAll();
    List<SectorEntity> findByCode(String code);
    List<SectorEntity> findByActive(Boolean active);
}
