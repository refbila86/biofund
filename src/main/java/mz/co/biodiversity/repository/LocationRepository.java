package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Long>, LocationRepositoryCustom {}
