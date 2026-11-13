package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.ActionExecutionEntity;

public interface ActionExecutionRepositoryCustom {
    List<ActionExecutionEntity> findAllOrdered();
    long countAll();
    List<ActionExecutionEntity> findByActionId(Long actionId);
    List<ActionExecutionEntity> findByFundingSourceId(Long fundingSourceId);
    List<ActionExecutionEntity> findByValidationStatusId(Long validationStatusId);
    List<ActionExecutionEntity> findByRecordedById(Long recordedById);
    List<ActionExecutionEntity> findByValidatedById(Long validatedById);
}
