package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.FundingSourceEntity;
import mz.co.biodiversity.repository.FundingSourceRepository;
import mz.co.biodiversity.service.IFundingSourceService;
@Service
@Transactional
public class FundingSourceServiceImpl implements IFundingSourceService {
    private final FundingSourceRepository repository;
    public FundingSourceServiceImpl(FundingSourceRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<FundingSourceEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<FundingSourceEntity> findById(Long id) { return repository.findById(id); }
    @Override public FundingSourceEntity save(FundingSourceEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
