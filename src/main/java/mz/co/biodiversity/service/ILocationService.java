package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.LocationEntity;
public interface ILocationService {
    List<LocationEntity> findAll();
    Optional<LocationEntity> findById(Long id);
    LocationEntity save(LocationEntity entity);
    void deleteById(Long id);
}
