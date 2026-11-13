package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "TargetEntity.findAll", query = "SELECT e FROM TargetEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "TargetEntity.findById", query = "SELECT e FROM TargetEntity e WHERE e.id = :id"),
    @NamedQuery(name = "TargetEntity.countAll", query = "SELECT COUNT(e) FROM TargetEntity e"),
    @NamedQuery(name = "TargetEntity.findByCode", query = "SELECT e FROM TargetEntity e WHERE e.code = :code ORDER BY e.id DESC"),
    @NamedQuery(name = "TargetEntity.findByActive", query = "SELECT e FROM TargetEntity e WHERE e.active = :active ORDER BY e.id DESC"),
    @NamedQuery(name = "TargetEntity.findByStrategicInstrumentId", query = "SELECT e FROM TargetEntity e WHERE e.strategic_instrument_id = :strategicInstrumentId ORDER BY e.id DESC")
})
@Entity
@Table(name = "TARGET")
public class TargetEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "STRATEGIC_INSTRUMENT_ID", nullable = true)
    private Long strategic_instrument_id;
    @Column(name = "CODE", nullable = true)
    private String code;
    @Column(name = "DESCRIPTION", nullable = true)
    private String description;
    @Column(name = "START_DATE", nullable = false)
    private java.time.LocalDate start_date;
    @Column(name = "END_DATE", nullable = false)
    private java.time.LocalDate end_date;
    @Column(name = "ACTIVE", nullable = true)
    private Boolean active;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getStrategic_instrument_id() { return strategic_instrument_id; }
    public void setStrategic_instrument_id(Long strategic_instrument_id) { this.strategic_instrument_id = strategic_instrument_id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public java.time.LocalDate getStart_date() { return start_date; }
    public void setStart_date(java.time.LocalDate start_date) { this.start_date = start_date; }
    public java.time.LocalDate getEnd_date() { return end_date; }
    public void setEnd_date(java.time.LocalDate end_date) { this.end_date = end_date; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
