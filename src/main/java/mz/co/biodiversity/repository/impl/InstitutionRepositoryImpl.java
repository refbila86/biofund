package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.InstitutionEntity;
import mz.co.biodiversity.repository.InstitutionRepositoryCustom;

@Repository
public class InstitutionRepositoryImpl implements InstitutionRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<InstitutionEntity> findAllOrdered() {
        return entityManager.createNamedQuery("InstitutionEntity.findAll", InstitutionEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("InstitutionEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<InstitutionEntity> findByCode(String code) {
        return entityManager.createNamedQuery("InstitutionEntity.findByCode", InstitutionEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<InstitutionEntity> findByStatus(String status) {
        return entityManager.createNamedQuery("InstitutionEntity.findByStatus", InstitutionEntity.class)
                .setParameter("status", status)
                .getResultList();
    }

    @Override
    public List<InstitutionEntity> findBySectorId(Long sectorId) {
        return entityManager.createNamedQuery("InstitutionEntity.findBySectorId", InstitutionEntity.class)
                .setParameter("sectorId", sectorId)
                .getResultList();
    }
}
