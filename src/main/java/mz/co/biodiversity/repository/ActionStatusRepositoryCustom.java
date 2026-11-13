package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ActionStatusEntity;

public interface ActionStatusRepositoryCustom {
    List<ActionStatusEntity> findAllOrdered();
    long countAll();
    List<ActionStatusEntity> findByCode(String code);
}
