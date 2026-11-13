package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "StrategicInstrumentEntity.findAll", query = "SELECT e FROM StrategicInstrumentEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "StrategicInstrumentEntity.findById", query = "SELECT e FROM StrategicInstrumentEntity e WHERE e.id = :id"),
    @NamedQuery(name = "StrategicInstrumentEntity.countAll", query = "SELECT COUNT(e) FROM StrategicInstrumentEntity e"),
    @NamedQuery(name = "StrategicInstrumentEntity.findByActive", query = "SELECT e FROM StrategicInstrumentEntity e WHERE e.active = :active ORDER BY e.id DESC")
})
@Entity
@Table(name = "STRATEGIC_INSTRUMENT")
public class StrategicInstrumentEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACRONYM", nullable = true)
    private String acronym;
    @Column(name = "NAME", nullable = true)
    private String name;
    @Column(name = "PERIOD_START", nullable = false)
    private java.time.LocalDate period_start;
    @Column(name = "PERIOD_END", nullable = false)
    private java.time.LocalDate period_end;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @Column(name = "ACTIVE", nullable = true)
    private Boolean active;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getAcronym() { return acronym; }
    public void setAcronym(String acronym) { this.acronym = acronym; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public java.time.LocalDate getPeriod_start() { return period_start; }
    public void setPeriod_start(java.time.LocalDate period_start) { this.period_start = period_start; }
    public java.time.LocalDate getPeriod_end() { return period_end; }
    public void setPeriod_end(java.time.LocalDate period_end) { this.period_end = period_end; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
