package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ActionEntity;

public interface ActionRepositoryCustom
{
	List<ActionEntity> findAllOrdered();

	long countAll();

	List<ActionEntity> findByCode(String code);

	List<ActionEntity> findByProjectId(Long projectId);

	List<ActionEntity> findByInstitutionId(Long institutionId);

	List<ActionEntity> findByInterventionTypeId(Long interventionTypeId);

	List<ActionEntity> findByActionStatusId(Long actionStatusId);

	List<ActionEntity> findByCreatedById(Long createdById);
}
