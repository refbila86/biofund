package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "InterventionTypeEntity.findAll", query = "SELECT e FROM InterventionTypeEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "InterventionTypeEntity.findById", query = "SELECT e FROM InterventionTypeEntity e WHERE e.id = :id"),
    @NamedQuery(name = "InterventionTypeEntity.countAll", query = "SELECT COUNT(e) FROM InterventionTypeEntity e"),
    @NamedQuery(name = "InterventionTypeEntity.findByCode", query = "SELECT e FROM InterventionTypeEntity e WHERE e.code = :code ORDER BY e.id DESC"),
    @NamedQuery(name = "InterventionTypeEntity.findByActive", query = "SELECT e FROM InterventionTypeEntity e WHERE e.active = :active ORDER BY e.id DESC")
})
@Entity
@Table(name = "INTERVENTION_TYPE")
public class InterventionTypeEntity implements Serializable {
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
    @Column(name = "ACTIVE", nullable = true)
    private Boolean active;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
