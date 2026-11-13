package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "ProgramEntity.findAll", query = "SELECT e FROM ProgramEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "ProgramEntity.findById", query = "SELECT e FROM ProgramEntity e WHERE e.id = :id"),
    @NamedQuery(name = "ProgramEntity.countAll", query = "SELECT COUNT(e) FROM ProgramEntity e"),
    @NamedQuery(name = "ProgramEntity.findByCode", query = "SELECT e FROM ProgramEntity e WHERE e.code = :code ORDER BY e.id DESC"),
    @NamedQuery(name = "ProgramEntity.findByStatus", query = "SELECT e FROM ProgramEntity e WHERE e.status = :status ORDER BY e.id DESC"),
    @NamedQuery(name = "ProgramEntity.findByCreatedById", query = "SELECT e FROM ProgramEntity e WHERE e.created_by_id = :createdById ORDER BY e.id DESC")
})
@Entity
@Table(name = "PROGRAM")
public class ProgramEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = true)
    private String code;
    @Column(name = "NAME", nullable = true)
    private String name;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
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
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
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
