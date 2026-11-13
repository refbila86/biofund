package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ValidationStatusEntity;

public interface ValidationStatusRepositoryCustom {
    List<ValidationStatusEntity> findAllOrdered();
    long countAll();
    List<ValidationStatusEntity> findByCode(String code);
}
