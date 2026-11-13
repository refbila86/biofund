package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ImportBatchEntity;

public interface ImportBatchRepositoryCustom {
    List<ImportBatchEntity> findAllOrdered();
    long countAll();
    List<ImportBatchEntity> findByStatus(String status);
    List<ImportBatchEntity> findByCreatedById(Long createdById);
}
