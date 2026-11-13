package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.BiodiversityClassificationEntity;
import mz.co.biodiversity.repository.BiodiversityClassificationRepositoryCustom;

@Repository
public class BiodiversityClassificationRepositoryImpl implements BiodiversityClassificationRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<BiodiversityClassificationEntity> findAllOrdered() {
        return entityManager.createNamedQuery("BiodiversityClassificationEntity.findAll", BiodiversityClassificationEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("BiodiversityClassificationEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<BiodiversityClassificationEntity> findByCode(String code) {
        return entityManager.createNamedQuery("BiodiversityClassificationEntity.findByCode", BiodiversityClassificationEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<BiodiversityClassificationEntity> findByActive(Boolean active) {
        return entityManager.createNamedQuery("BiodiversityClassificationEntity.findByActive", BiodiversityClassificationEntity.class)
                .setParameter("active", active)
                .getResultList();
    }
}
