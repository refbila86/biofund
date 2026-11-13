package mz.co.biodiversity.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import mz.co.biodiversity.model.entity.ProjectEntity;
import mz.co.biodiversity.repository.ProjectRepositoryCustom;

@Repository
public class ProjectRepositoryImpl implements ProjectRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<ProjectEntity> findAllOrdered() {
        return entityManager.createNamedQuery("ProjectEntity.findAll", ProjectEntity.class)
                .getResultList();
    }

    @Override
    public long countAll() {
        return entityManager.createNamedQuery("ProjectEntity.countAll", Long.class).getSingleResult();
    }

    @Override
    public List<ProjectEntity> findByCode(String code) {
        return entityManager.createNamedQuery("ProjectEntity.findByCode", ProjectEntity.class)
                .setParameter("code", code)
                .getResultList();
    }

    @Override
    public List<ProjectEntity> findByStatus(String status) {
        return entityManager.createNamedQuery("ProjectEntity.findByStatus", ProjectEntity.class)
                .setParameter("status", status)
                .getResultList();
    }

    @Override
    public List<ProjectEntity> findByProgramId(Long programId) {
        return entityManager.createNamedQuery("ProjectEntity.findByProgramId", ProjectEntity.class)
                .setParameter("programId", programId)
                .getResultList();
    }

    @Override
    public List<ProjectEntity> findByResponsibleInstitutionId(Long responsibleInstitutionId) {
        return entityManager.createNamedQuery("ProjectEntity.findByResponsibleInstitutionId", ProjectEntity.class)
                .setParameter("responsibleInstitutionId", responsibleInstitutionId)
                .getResultList();
    }

    @Override
    public List<ProjectEntity> findByCreatedById(Long createdById) {
        return entityManager.createNamedQuery("ProjectEntity.findByCreatedById", ProjectEntity.class)
                .setParameter("createdById", createdById)
                .getResultList();
    }
}
