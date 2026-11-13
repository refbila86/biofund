package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.BiodiversityClassificationEntity;

public interface BiodiversityClassificationRepositoryCustom {
    List<BiodiversityClassificationEntity> findAllOrdered();
    long countAll();
    List<BiodiversityClassificationEntity> findByCode(String code);
    List<BiodiversityClassificationEntity> findByActive(Boolean active);
}
