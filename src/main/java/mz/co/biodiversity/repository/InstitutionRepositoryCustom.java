package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.InstitutionEntity;

public interface InstitutionRepositoryCustom {
    List<InstitutionEntity> findAllOrdered();
    long countAll();
    List<InstitutionEntity> findByCode(String code);
    List<InstitutionEntity> findByStatus(String status);
    List<InstitutionEntity> findBySectorId(Long sectorId);
}
