package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.AuditHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AuditHistoryRepository extends JpaRepository<AuditHistoryEntity, Long>, AuditHistoryRepositoryCustom {}
