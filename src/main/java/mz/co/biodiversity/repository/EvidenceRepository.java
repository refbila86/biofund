package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.EvidenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EvidenceRepository extends JpaRepository<EvidenceEntity, Long>, EvidenceRepositoryCustom {}
