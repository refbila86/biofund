package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ActionBiodiversityTaggingEntity;

public interface ActionBiodiversityTaggingRepositoryCustom
{
	List<ActionBiodiversityTaggingEntity> findAllOrdered();

	long countAll();

	List<ActionBiodiversityTaggingEntity> findByActionId(Long actionId);

	List<ActionBiodiversityTaggingEntity> findByBiodiversityClassificationId(Long biodiversityClassificationId);

	List<ActionBiodiversityTaggingEntity> findByValidationStatusId(Long validationStatusId);

	List<ActionBiodiversityTaggingEntity> findByClassifiedById(Long classifiedById);

	List<ActionBiodiversityTaggingEntity> findByValidatedById(Long validatedById);
}
