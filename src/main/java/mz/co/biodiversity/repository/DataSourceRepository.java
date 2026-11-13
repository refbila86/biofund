package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.DataSourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DataSourceRepository extends JpaRepository<DataSourceEntity, Long>, DataSourceRepositoryCustom {}
