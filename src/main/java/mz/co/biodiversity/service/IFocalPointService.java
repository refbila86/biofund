package mz.co.biodiversity.service;
import java.util.List;
import java.util.Optional;
import mz.co.biodiversity.model.entity.FocalPointEntity;
public interface IFocalPointService {
    List<FocalPointEntity> findAll();
    Optional<FocalPointEntity> findById(Long id);
    FocalPointEntity save(FocalPointEntity entity);
    void deleteById(Long id);
}
