package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ProgramEntity;

public interface ProgramRepositoryCustom {
    List<ProgramEntity> findAllOrdered();
    long countAll();
    List<ProgramEntity> findByCode(String code);
    List<ProgramEntity> findByStatus(String status);
    List<ProgramEntity> findByCreatedById(Long createdById);
}
