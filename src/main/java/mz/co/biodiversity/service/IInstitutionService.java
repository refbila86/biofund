package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.InstitutionEntity;
public interface IInstitutionService {
    List<InstitutionEntity> findAll();
    Optional<InstitutionEntity> findById(Long id);
    InstitutionEntity save(InstitutionEntity entity);
    void deleteById(Long id);
}
