package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.ProgramEntity;
import mz.co.biodiversity.repository.ProgramRepository;
import mz.co.biodiversity.service.IProgramService;
@Service
@Transactional
public class ProgramServiceImpl implements IProgramService {
    private final ProgramRepository repository;
    public ProgramServiceImpl(ProgramRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<ProgramEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<ProgramEntity> findById(Long id) { return repository.findById(id); }
    @Override public ProgramEntity save(ProgramEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
