package mz.co.biodiversity.repository;

import mz.co.biodiversity.model.entity.ActionBiodiversityTaggingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionBiodiversityTaggingRepository extends JpaRepository<ActionBiodiversityTaggingEntity, Long>, ActionBiodiversityTaggingRepositoryCustom
{
}
