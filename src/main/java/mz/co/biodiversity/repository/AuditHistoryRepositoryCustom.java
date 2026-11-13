package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.AuditHistoryEntity;

public interface AuditHistoryRepositoryCustom {
    List<AuditHistoryEntity> findAllOrdered();
    long countAll();
    List<AuditHistoryEntity> findByUserId(Long userId);
}
