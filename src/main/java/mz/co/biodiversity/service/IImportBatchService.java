package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ImportBatchEntity;
public interface IImportBatchService {
    List<ImportBatchEntity> findAll();
    Optional<ImportBatchEntity> findById(Long id);
    ImportBatchEntity save(ImportBatchEntity entity);
    void deleteById(Long id);
}
