package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "InstitutionEntity.findAll", query = "SELECT e FROM InstitutionEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "InstitutionEntity.findById", query = "SELECT e FROM InstitutionEntity e WHERE e.id = :id"),
    @NamedQuery(name = "InstitutionEntity.countAll", query = "SELECT COUNT(e) FROM InstitutionEntity e"),
    @NamedQuery(name = "InstitutionEntity.findByCode", query = "SELECT e FROM InstitutionEntity e WHERE e.code = :code ORDER BY e.id DESC"),
    @NamedQuery(name = "InstitutionEntity.findByStatus", query = "SELECT e FROM InstitutionEntity e WHERE e.status = :status ORDER BY e.id DESC"),
    @NamedQuery(name = "InstitutionEntity.findBySectorId", query = "SELECT e FROM InstitutionEntity e WHERE e.sector_id = :sectorId ORDER BY e.id DESC")
})
@Entity
@Table(name = "INSTITUTION")
public class InstitutionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false)
    private String code;
    @Column(name = "NAME", nullable = true)
    private String name;
    @Column(name = "ACRONYM", nullable = false)
    private String acronym;
    @Column(name = "MANDATE", nullable = false)
    private String mandate;
    @Column(name = "SECTOR_ID", nullable = false)
    private Long sector_id;
    @Column(name = "ADMINISTRATIVE_LEVEL", nullable = false)
    private String administrative_level;
    @Column(name = "INSTITUTIONAL_EMAIL", nullable = false)
    private String institutional_email;
    @Column(name = "PHONE", nullable = false)
    private String phone;
    @Column(name = "STATUS", nullable = true)
    private String status;
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
    public String getAcronym() { return acronym; }
    public void setAcronym(String acronym) { this.acronym = acronym; }
    public String getMandate() { return mandate; }
    public void setMandate(String mandate) { this.mandate = mandate; }
    public Long getSector_id() { return sector_id; }
    public void setSector_id(Long sector_id) { this.sector_id = sector_id; }
    public String getAdministrative_level() { return administrative_level; }
    public void setAdministrative_level(String administrative_level) { this.administrative_level = administrative_level; }
    public String getInstitutional_email() { return institutional_email; }
    public void setInstitutional_email(String institutional_email) { this.institutional_email = institutional_email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public java.time.OffsetDateTime getCreated_at() { return created_at; }
    public void setCreated_at(java.time.OffsetDateTime created_at) { this.created_at = created_at; }
    public java.time.OffsetDateTime getUpdated_at() { return updated_at; }
    public void setUpdated_at(java.time.OffsetDateTime updated_at) { this.updated_at = updated_at; }
}
