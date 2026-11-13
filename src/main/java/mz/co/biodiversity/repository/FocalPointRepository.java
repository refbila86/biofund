package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.FocalPointEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FocalPointRepository extends JpaRepository<FocalPointEntity, Long>, FocalPointRepositoryCustom {}
