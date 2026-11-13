package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ValidationStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ValidationStatusRepository extends JpaRepository<ValidationStatusEntity, Long>, ValidationStatusRepositoryCustom {}
