package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "IndicatorValueEntity.findAll", query = "SELECT e FROM IndicatorValueEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorValueEntity.findById", query = "SELECT e FROM IndicatorValueEntity e WHERE e.id = :id"),
    @NamedQuery(name = "IndicatorValueEntity.countAll", query = "SELECT COUNT(e) FROM IndicatorValueEntity e"),
    @NamedQuery(name = "IndicatorValueEntity.findByIndicatorId", query = "SELECT e FROM IndicatorValueEntity e WHERE e.indicator_id = :indicatorId ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorValueEntity.findByActionId", query = "SELECT e FROM IndicatorValueEntity e WHERE e.action_id = :actionId ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorValueEntity.findByDataSourceId", query = "SELECT e FROM IndicatorValueEntity e WHERE e.data_source_id = :dataSourceId ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorValueEntity.findByValidationStatusId", query = "SELECT e FROM IndicatorValueEntity e WHERE e.validation_status_id = :validationStatusId ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorValueEntity.findByRecordedById", query = "SELECT e FROM IndicatorValueEntity e WHERE e.recorded_by_id = :recordedById ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorValueEntity.findByValidatedById", query = "SELECT e FROM IndicatorValueEntity e WHERE e.validated_by_id = :validatedById ORDER BY e.id DESC")
})
@Entity
@Table(name = "INDICATOR_VALUE")
public class IndicatorValueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "INDICATOR_ID", nullable = true)
    private Long indicator_id;
    @Column(name = "ACTION_ID", nullable = false)
    private Long action_id;
    @Column(name = "DATA_SOURCE_ID", nullable = false)
    private Long data_source_id;
    @Column(name = "VALIDATION_STATUS_ID", nullable = true)
    private Long validation_status_id;
    @Column(name = "PERIOD_START", nullable = true)
    private java.time.LocalDate period_start;
    @Column(name = "PERIOD_END", nullable = true)
    private java.time.LocalDate period_end;
    @Column(name = "OBSERVED_VALUE", nullable = false)
    private java.math.BigDecimal observed_value;
    @Column(name = "TEXT_VALUE", nullable = false)
    private String text_value;
    @Column(name = "RECORDED_AT", nullable = true)
    private java.time.OffsetDateTime recorded_at;
    @Column(name = "RECORDED_BY_ID", nullable = false)
    private Long recorded_by_id;
    @Column(name = "VALIDATED_BY_ID", nullable = false)
    private Long validated_by_id;
    @Column(name = "VALIDATED_AT", nullable = false)
    private java.time.OffsetDateTime validated_at;
    @Column(name = "EVIDENCE_REFERENCE", nullable = false)
    private String evidence_reference;
    @Column(name = "VALIDATION_COMMENT", nullable = false)
    private String validation_comment;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getIndicator_id() { return indicator_id; }
    public void setIndicator_id(Long indicator_id) { this.indicator_id = indicator_id; }
    public Long getAction_id() { return action_id; }
    public void setAction_id(Long action_id) { this.action_id = action_id; }
    public Long getData_source_id() { return data_source_id; }
    public void setData_source_id(Long data_source_id) { this.data_source_id = data_source_id; }
    public Long getValidation_status_id() { return validation_status_id; }
    public void setValidation_status_id(Long validation_status_id) { this.validation_status_id = validation_status_id; }
    public java.time.LocalDate getPeriod_start() { return period_start; }
    public void setPeriod_start(java.time.LocalDate period_start) { this.period_start = period_start; }
    public java.time.LocalDate getPeriod_end() { return period_end; }
    public void setPeriod_end(java.time.LocalDate period_end) { this.period_end = period_end; }
    public java.math.BigDecimal getObserved_value() { return observed_value; }
    public void setObserved_value(java.math.BigDecimal observed_value) { this.observed_value = observed_value; }
    public String getText_value() { return text_value; }
    public void setText_value(String text_value) { this.text_value = text_value; }
    public java.time.OffsetDateTime getRecorded_at() { return recorded_at; }
    public void setRecorded_at(java.time.OffsetDateTime recorded_at) { this.recorded_at = recorded_at; }
    public Long getRecorded_by_id() { return recorded_by_id; }
    public void setRecorded_by_id(Long recorded_by_id) { this.recorded_by_id = recorded_by_id; }
    public Long getValidated_by_id() { return validated_by_id; }
    public void setValidated_by_id(Long validated_by_id) { this.validated_by_id = validated_by_id; }
    public java.time.OffsetDateTime getValidated_at() { return validated_at; }
    public void setValidated_at(java.time.OffsetDateTime validated_at) { this.validated_at = validated_at; }
    public String getEvidence_reference() { return evidence_reference; }
    public void setEvidence_reference(String evidence_reference) { this.evidence_reference = evidence_reference; }
    public String getValidation_comment() { return validation_comment; }
    public void setValidation_comment(String validation_comment) { this.validation_comment = validation_comment; }
}
