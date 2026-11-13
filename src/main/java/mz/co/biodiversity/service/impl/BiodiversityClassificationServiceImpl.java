package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.BiodiversityClassificationEntity;
import mz.co.biodiversity.repository.BiodiversityClassificationRepository;
import mz.co.biodiversity.service.IBiodiversityClassificationService;
@Service
@Transactional
public class BiodiversityClassificationServiceImpl implements IBiodiversityClassificationService {
    private final BiodiversityClassificationRepository repository;
    public BiodiversityClassificationServiceImpl(BiodiversityClassificationRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<BiodiversityClassificationEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<BiodiversityClassificationEntity> findById(Long id) { return repository.findById(id); }
    @Override public BiodiversityClassificationEntity save(BiodiversityClassificationEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
