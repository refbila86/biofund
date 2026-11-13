package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "ProjectEntity.findAll", query = "SELECT e FROM ProjectEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "ProjectEntity.findById", query = "SELECT e FROM ProjectEntity e WHERE e.id = :id"),
    @NamedQuery(name = "ProjectEntity.countAll", query = "SELECT COUNT(e) FROM ProjectEntity e"),
    @NamedQuery(name = "ProjectEntity.findByCode", query = "SELECT e FROM ProjectEntity e WHERE e.code = :code ORDER BY e.id DESC"),
    @NamedQuery(name = "ProjectEntity.findByStatus", query = "SELECT e FROM ProjectEntity e WHERE e.status = :status ORDER BY e.id DESC"),
    @NamedQuery(name = "ProjectEntity.findByProgramId", query = "SELECT e FROM ProjectEntity e WHERE e.program_id = :programId ORDER BY e.id DESC"),
    @NamedQuery(name = "ProjectEntity.findByResponsibleInstitutionId", query = "SELECT e FROM ProjectEntity e WHERE e.responsible_institution_id = :responsibleInstitutionId ORDER BY e.id DESC"),
    @NamedQuery(name = "ProjectEntity.findByCreatedById", query = "SELECT e FROM ProjectEntity e WHERE e.created_by_id = :createdById ORDER BY e.id DESC")
})
@Entity
@Table(name = "PROJECT")
public class ProjectEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PROGRAM_ID", nullable = false)
    private Long program_id;
    @Column(name = "CODE", nullable = true)
    private String code;
    @Column(name = "NAME", nullable = true)
    private String name;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @Column(name = "RESPONSIBLE_INSTITUTION_ID", nullable = false)
    private Long responsible_institution_id;
    @Column(name = "IMPLEMENTING_UNIT", nullable = false)
    private String implementing_unit;
    @Column(name = "START_DATE", nullable = false)
    private java.time.LocalDate start_date;
    @Column(name = "END_DATE", nullable = false)
    private java.time.LocalDate end_date;
    @Column(name = "STATUS", nullable = true)
    private String status;
    @Column(name = "CREATED_BY_ID", nullable = false)
    private Long created_by_id;
    @Column(name = "CREATED_AT", nullable = true)
    private java.time.OffsetDateTime created_at;
    @Column(name = "UPDATED_AT", nullable = true)
    private java.time.OffsetDateTime updated_at;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getProgram_id() { return program_id; }
    public void setProgram_id(Long program_id) { this.program_id = program_id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Long getResponsible_institution_id() { return responsible_institution_id; }
    public void setResponsible_institution_id(Long responsible_institution_id) { this.responsible_institution_id = responsible_institution_id; }
    public String getImplementing_unit() { return implementing_unit; }
    public void setImplementing_unit(String implementing_unit) { this.implementing_unit = implementing_unit; }
    public java.time.LocalDate getStart_date() { return start_date; }
    public void setStart_date(java.time.LocalDate start_date) { this.start_date = start_date; }
    public java.time.LocalDate getEnd_date() { return end_date; }
    public void setEnd_date(java.time.LocalDate end_date) { this.end_date = end_date; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Long getCreated_by_id() { return created_by_id; }
    public void setCreated_by_id(Long created_by_id) { this.created_by_id = created_by_id; }
    public java.time.OffsetDateTime getCreated_at() { return created_at; }
    public void setCreated_at(java.time.OffsetDateTime created_at) { this.created_at = created_at; }
    public java.time.OffsetDateTime getUpdated_at() { return updated_at; }
    public void setUpdated_at(java.time.OffsetDateTime updated_at) { this.updated_at = updated_at; }
}
