package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.InterventionTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InterventionTypeRepository extends JpaRepository<InterventionTypeEntity, Long>, InterventionTypeRepositoryCustom {}
