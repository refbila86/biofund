package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.InterventionTypeEntity;

public interface InterventionTypeRepositoryCustom {
    List<InterventionTypeEntity> findAllOrdered();
    long countAll();
    List<InterventionTypeEntity> findByCode(String code);
    List<InterventionTypeEntity> findByActive(Boolean active);
}
