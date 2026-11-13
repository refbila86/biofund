package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.AuditHistoryEntity;
public interface IAuditHistoryService {
    List<AuditHistoryEntity> findAll();
    Optional<AuditHistoryEntity> findById(Long id);
    AuditHistoryEntity save(AuditHistoryEntity entity);
    void deleteById(Long id);
}
