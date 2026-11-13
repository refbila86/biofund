package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.FocalPointEntity;
import mz.co.biodiversity.repository.FocalPointRepositoryCustom;

@Repository
public class FocalPointRepositoryImpl implements FocalPointRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<FocalPointEntity> findAllOrdered() {
        return entityManager.createNamedQuery("FocalPointEntity.findAll", FocalPointEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("FocalPointEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<FocalPointEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("FocalPointEntity.findByActive", FocalPointEntity.class)
                .setParameter("active", active)
                .getResultList();
    }

    @Override
    public List<FocalPointEntity> findByInstitutionId(Long institutionId) {
        return entityManager.createNamedQuery("FocalPointEntity.findByInstitutionId", FocalPointEntity.class)
                .setParameter("institutionId", institutionId)
                .getResultList();
    }
}
