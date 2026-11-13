package mz.co.biodiversity.repository;
import mz.co.biodiversity.model.entity.ProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProgramRepository extends JpaRepository<ProgramEntity, Long>, ProgramRepositoryCustom {}
