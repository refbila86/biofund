package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.FundingSourceEntity;
import mz.co.biodiversity.repository.FundingSourceRepositoryCustom;

@Repository
public class FundingSourceRepositoryImpl implements FundingSourceRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<FundingSourceEntity> findAllOrdered() {
        return entityManager.createNamedQuery("FundingSourceEntity.findAll", FundingSourceEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("FundingSourceEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<FundingSourceEntity> findByCode(String code) {
        return entityManager.createNamedQuery("FundingSourceEntity.findByCode", FundingSourceEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<FundingSourceEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("FundingSourceEntity.findByActive", FundingSourceEntity.class)
                .setParameter("active", active)
                .getResultList();
    }
}
