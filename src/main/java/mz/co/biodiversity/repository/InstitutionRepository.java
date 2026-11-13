package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.InstitutionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface InstitutionRepository extends JpaRepository<InstitutionEntity, Long>, InstitutionRepositoryCustom {}
