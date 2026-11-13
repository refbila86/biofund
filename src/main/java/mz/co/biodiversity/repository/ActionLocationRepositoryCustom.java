package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ActionLocationEntity;

public interface ActionLocationRepositoryCustom {
    List<ActionLocationEntity> findAllOrdered();
    long countAll();
    List<ActionLocationEntity> findByActionId(Long actionId);
    List<ActionLocationEntity> findByLocationId(Long locationId);
}
