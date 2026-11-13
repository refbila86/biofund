package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.FundingSourceEntity;

public interface FundingSourceRepositoryCustom {
    List<FundingSourceEntity> findAllOrdered();
    long countAll();
    List<FundingSourceEntity> findByCode(String code);
    List<FundingSourceEntity> findByActive(Boolean active);
}
