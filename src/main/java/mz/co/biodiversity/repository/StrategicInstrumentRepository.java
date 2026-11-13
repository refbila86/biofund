package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.StrategicInstrumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StrategicInstrumentRepository extends JpaRepository<StrategicInstrumentEntity, Long>, StrategicInstrumentRepositoryCustom {}
