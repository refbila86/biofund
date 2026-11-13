package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.BiodiversityClassificationEntity;
public interface IBiodiversityClassificationService {
    List<BiodiversityClassificationEntity> findAll();
    Optional<BiodiversityClassificationEntity> findById(Long id);
    BiodiversityClassificationEntity save(BiodiversityClassificationEntity entity);
    void deleteById(Long id);
}
