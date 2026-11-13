package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.TargetEntity;
public interface ITargetService {
    List<TargetEntity> findAll();
    Optional<TargetEntity> findById(Long id);
    TargetEntity save(TargetEntity entity);
    void deleteById(Long id);
}
