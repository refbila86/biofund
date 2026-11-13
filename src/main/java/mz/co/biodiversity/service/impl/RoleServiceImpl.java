package mz.co.biodiversity.service.impl;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mz.co.biodiversity.model.entity.RoleEntity;
import mz.co.biodiversity.repository.RoleRepository;
import mz.co.biodiversity.service.IRoleService;
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {
    private final RoleRepository repository;
    public RoleServiceImpl(RoleRepository repository) { this.repository = repository; }
    @Override @Transactional(readOnly = true) public List<RoleEntity> findAll() { return repository.findAllOrdered(); }
    @Override @Transactional(readOnly = true) public Optional<RoleEntity> findById(Long id) { return repository.findById(id); }
    @Override public RoleEntity save(RoleEntity entity) { return repository.save(entity); }
    @Override public void deleteById(Long id) { repository.deleteById(id); }
}
