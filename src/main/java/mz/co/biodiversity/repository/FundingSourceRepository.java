package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.FundingSourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FundingSourceRepository extends JpaRepository<FundingSourceEntity, Long>, FundingSourceRepositoryCustom {}
