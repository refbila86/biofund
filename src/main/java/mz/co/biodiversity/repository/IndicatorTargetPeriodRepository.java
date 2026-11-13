package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.IndicatorTargetPeriodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IndicatorTargetPeriodRepository extends JpaRepository<IndicatorTargetPeriodEntity, Long>, IndicatorTargetPeriodRepositoryCustom {}
