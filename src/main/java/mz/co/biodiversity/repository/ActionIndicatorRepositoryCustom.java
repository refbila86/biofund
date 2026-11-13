package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ActionIndicatorEntity;

public interface ActionIndicatorRepositoryCustom {
    List<ActionIndicatorEntity> findAllOrdered();
    long countAll();
    List<ActionIndicatorEntity> findByActionId(Long actionId);
    List<ActionIndicatorEntity> findByIndicatorId(Long indicatorId);
}
