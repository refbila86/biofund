package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "IndicatorTargetPeriodEntity.findAll", query = "SELECT e FROM IndicatorTargetPeriodEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorTargetPeriodEntity.findById", query = "SELECT e FROM IndicatorTargetPeriodEntity e WHERE e.id = :id"),
    @NamedQuery(name = "IndicatorTargetPeriodEntity.countAll", query = "SELECT COUNT(e) FROM IndicatorTargetPeriodEntity e"),
    @NamedQuery(name = "IndicatorTargetPeriodEntity.findByIndicatorId", query = "SELECT e FROM IndicatorTargetPeriodEntity e WHERE e.indicator_id = :indicatorId ORDER BY e.id DESC")
})
@Entity
@Table(name = "INDICATOR_TARGET_PERIOD")
public class IndicatorTargetPeriodEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "INDICATOR_ID", nullable = true)
    private Long indicator_id;
    @Column(name = "YEAR", nullable = true)
    private Integer year;
    @Column(name = "BASELINE_VALUE", nullable = false)
    private java.math.BigDecimal baseline_value;
    @Column(name = "BASELINE_YEAR", nullable = false)
    private Integer baseline_year;
    @Column(name = "TARGET_VALUE", nullable = false)
    private java.math.BigDecimal target_value;
    @Column(name = "OBSERVACAO", nullable = false)
    private String observacao;
    @Column(name = "CREATED_AT", nullable = true)
    private java.time.OffsetDateTime created_at;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getIndicator_id() { return indicator_id; }
    public void setIndicator_id(Long indicator_id) { this.indicator_id = indicator_id; }
    public Integer getYear() { return year; }
    public void setYear(Integer year) { this.year = year; }
    public java.math.BigDecimal getBaseline_value() { return baseline_value; }
    public void setBaseline_value(java.math.BigDecimal baseline_value) { this.baseline_value = baseline_value; }
    public Integer getBaseline_year() { return baseline_year; }
    public void setBaseline_year(Integer baseline_year) { this.baseline_year = baseline_year; }
    public java.math.BigDecimal getTarget_value() { return target_value; }
    public void setTarget_value(java.math.BigDecimal target_value) { this.target_value = target_value; }
    public String getObservacao() { return observacao; }
    public void setObservacao(String observacao) { this.observacao = observacao; }
    public java.time.OffsetDateTime getCreated_at() { return created_at; }
    public void setCreated_at(java.time.OffsetDateTime created_at) { this.created_at = created_at; }
}
