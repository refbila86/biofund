package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ActionTargetEntity;

public interface ActionTargetRepositoryCustom {
    List<ActionTargetEntity> findAllOrdered();
    long countAll();
    List<ActionTargetEntity> findByActionId(Long actionId);
    List<ActionTargetEntity> findByTargetId(Long targetId);
}
