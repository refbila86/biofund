package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ProgramEntity;
public interface IProgramService {
    List<ProgramEntity> findAll();
    Optional<ProgramEntity> findById(Long id);
    ProgramEntity save(ProgramEntity entity);
    void deleteById(Long id);
}
