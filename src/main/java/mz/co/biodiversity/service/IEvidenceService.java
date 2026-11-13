package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.EvidenceEntity;
public interface IEvidenceService {
    List<EvidenceEntity> findAll();
    Optional<EvidenceEntity> findById(Long id);
    EvidenceEntity save(EvidenceEntity entity);
    void deleteById(Long id);
}
