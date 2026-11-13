package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.FundingSourceEntity;
public interface IFundingSourceService {
    List<FundingSourceEntity> findAll();
    Optional<FundingSourceEntity> findById(Long id);
    FundingSourceEntity save(FundingSourceEntity entity);
    void deleteById(Long id);
}
