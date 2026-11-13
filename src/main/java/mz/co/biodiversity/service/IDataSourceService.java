package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.DataSourceEntity;
public interface IDataSourceService {
    List<DataSourceEntity> findAll();
    Optional<DataSourceEntity> findById(Long id);
    DataSourceEntity save(DataSourceEntity entity);
    void deleteById(Long id);
}
