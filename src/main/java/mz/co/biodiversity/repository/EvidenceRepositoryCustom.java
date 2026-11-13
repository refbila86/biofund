package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.EvidenceEntity;

public interface EvidenceRepositoryCustom {
    List<EvidenceEntity> findAllOrdered();
    long countAll();
    List<EvidenceEntity> findByActionId(Long actionId);
    List<EvidenceEntity> findByUploadedById(Long uploadedById);
}
