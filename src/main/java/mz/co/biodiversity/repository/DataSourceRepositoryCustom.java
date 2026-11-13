package mz.co.biodiversity.repository;

import java.util.List;
import mz.co.biodiversity.model.entity.DataSourceEntity;

public interface DataSourceRepositoryCustom {
    List<DataSourceEntity> findAllOrdered();
    long countAll();
    List<DataSourceEntity> findByActive(Boolean active);
}
