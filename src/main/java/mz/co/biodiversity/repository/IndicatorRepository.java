package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.IndicatorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IndicatorRepository extends JpaRepository<IndicatorEntity, Long>, IndicatorRepositoryCustom {}
