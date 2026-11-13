package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.SectorEntity;
import mz.co.biodiversity.repository.SectorRepositoryCustom;

@Repository
public class SectorRepositoryImpl implements SectorRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<SectorEntity> findAllOrdered() {
        return entityManager.createNamedQuery("SectorEntity.findAll", SectorEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("SectorEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<SectorEntity> findByCode(String code) {
        return entityManager.createNamedQuery("SectorEntity.findByCode", SectorEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<SectorEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("SectorEntity.findByActive", SectorEntity.class)
                .setParameter("active", active)
                .getResultList();
    }
}
