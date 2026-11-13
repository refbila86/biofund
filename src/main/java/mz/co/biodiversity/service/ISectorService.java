package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.SectorEntity;
public interface ISectorService {
    List<SectorEntity> findAll();
    Optional<SectorEntity> findById(Long id);
    SectorEntity save(SectorEntity entity);
    void deleteById(Long id);
}
