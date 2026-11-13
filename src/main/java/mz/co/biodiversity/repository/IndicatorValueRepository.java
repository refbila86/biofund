package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.IndicatorValueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IndicatorValueRepository extends JpaRepository<IndicatorValueEntity, Long>, IndicatorValueRepositoryCustom {}
