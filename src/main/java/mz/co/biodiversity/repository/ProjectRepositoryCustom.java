package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ProjectEntity;

public interface ProjectRepositoryCustom {
    List<ProjectEntity> findAllOrdered();
    long countAll();
    List<ProjectEntity> findByCode(String code);
    List<ProjectEntity> findByStatus(String status);
    List<ProjectEntity> findByProgramId(Long programId);
    List<ProjectEntity> findByResponsibleInstitutionId(Long responsibleInstitutionId);
    List<ProjectEntity> findByCreatedById(Long createdById);
}
