package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.ActionLocationEntity;
public interface IActionLocationService {
    List<ActionLocationEntity> findAll();
    Optional<ActionLocationEntity> findById(Long id);
    ActionLocationEntity save(ActionLocationEntity entity);
    void deleteById(Long id);
}
