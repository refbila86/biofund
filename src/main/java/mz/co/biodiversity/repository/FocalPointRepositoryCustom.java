package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.FocalPointEntity;

public interface FocalPointRepositoryCustom {
    List<FocalPointEntity> findAllOrdered();
    long countAll();
    List<FocalPointEntity> findByActive(Boolean active);
    List<FocalPointEntity> findByInstitutionId(Long institutionId);
}
