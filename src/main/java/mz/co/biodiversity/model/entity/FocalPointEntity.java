package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "FocalPointEntity.findAll", query = "SELECT e FROM FocalPointEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "FocalPointEntity.findById", query = "SELECT e FROM FocalPointEntity e WHERE e.id = :id"),
    @NamedQuery(name = "FocalPointEntity.countAll", query = "SELECT COUNT(e) FROM FocalPointEntity e"),
    @NamedQuery(name = "FocalPointEntity.findByActive", query = "SELECT e FROM FocalPointEntity e WHERE e.active = :active ORDER BY e.id DESC"),
    @NamedQuery(name = "FocalPointEntity.findByInstitutionId", query = "SELECT e FROM FocalPointEntity e WHERE e.institution_id = :institutionId ORDER BY e.id DESC")
})
@Entity
@Table(name = "FOCAL_POINT")
public class FocalPointEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "INSTITUTION_ID", nullable = true)
    private Long institution_id;
    @Column(name = "NAME", nullable = true)
    private String name;
    @Column(name = "POSITION", nullable = false)
    private String position;
    @Column(name = "EMAIL", nullable = false)
    private String email;
    @Column(name = "PHONE", nullable = false)
    private String phone;
    @Column(name = "START_DATE", nullable = false)
    private java.time.LocalDate start_date;
    @Column(name = "END_DATE", nullable = false)
    private java.time.LocalDate end_date;
    @Column(name = "ACTIVE", nullable = true)
    private Boolean active;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getInstitution_id() { return institution_id; }
    public void setInstitution_id(Long institution_id) { this.institution_id = institution_id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public java.time.LocalDate getStart_date() { return start_date; }
    public void setStart_date(java.time.LocalDate start_date) { this.start_date = start_date; }
    public java.time.LocalDate getEnd_date() { return end_date; }
    public void setEnd_date(java.time.LocalDate end_date) { this.end_date = end_date; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
