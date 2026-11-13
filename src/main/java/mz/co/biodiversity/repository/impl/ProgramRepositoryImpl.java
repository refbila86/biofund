package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ProgramEntity;
import mz.co.biodiversity.repository.ProgramRepositoryCustom;

@Repository
public class ProgramRepositoryImpl implements ProgramRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ProgramEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ProgramEntity.findAll", ProgramEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ProgramEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ProgramEntity> findByCode(String code) {
        return entityManager.createNamedQuery("ProgramEntity.findByCode", ProgramEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<ProgramEntity> findByStatus(String status) {
        return entityManager.createNamedQuery("ProgramEntity.findByStatus", ProgramEntity.class)
                .setParameter("status", status)
                .getResultList();
    }

    @Override
    public List<ProgramEntity> findByCreatedById(Long createdById) {
        return entityManager.createNamedQuery("ProgramEntity.findByCreatedById", ProgramEntity.class)
                .setParameter("createdById", createdById)
                .getResultList();
    }
}
