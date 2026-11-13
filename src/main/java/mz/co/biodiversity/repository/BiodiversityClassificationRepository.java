package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.BiodiversityClassificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BiodiversityClassificationRepository extends JpaRepository<BiodiversityClassificationEntity, Long>, BiodiversityClassificationRepositoryCustom {}
