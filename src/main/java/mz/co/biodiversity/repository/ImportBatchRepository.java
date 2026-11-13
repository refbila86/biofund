package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ImportBatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ImportBatchRepository extends JpaRepository<ImportBatchEntity, Long>, ImportBatchRepositoryCustom {}
