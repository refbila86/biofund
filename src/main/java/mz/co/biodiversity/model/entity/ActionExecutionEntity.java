package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "ActionExecutionEntity.findAll", query = "SELECT e FROM ActionExecutionEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionExecutionEntity.findById", query = "SELECT e FROM ActionExecutionEntity e WHERE e.id = :id"),
    @NamedQuery(name = "ActionExecutionEntity.countAll", query = "SELECT COUNT(e) FROM ActionExecutionEntity e"),
    @NamedQuery(name = "ActionExecutionEntity.findByActionId", query = "SELECT e FROM ActionExecutionEntity e WHERE e.action_id = :actionId ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionExecutionEntity.findByFundingSourceId", query = "SELECT e FROM ActionExecutionEntity e WHERE e.funding_source_id = :fundingSourceId ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionExecutionEntity.findByValidationStatusId", query = "SELECT e FROM ActionExecutionEntity e WHERE e.validation_status_id = :validationStatusId ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionExecutionEntity.findByRecordedById", query = "SELECT e FROM ActionExecutionEntity e WHERE e.recorded_by_id = :recordedById ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionExecutionEntity.findByValidatedById", query = "SELECT e FROM ActionExecutionEntity e WHERE e.validated_by_id = :validatedById ORDER BY e.id DESC")
})
@Entity
@Table(name = "ACTION_EXECUTION")
public class ActionExecutionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTION_ID", nullable = true)
    private Long action_id;
    @Column(name = "FUNDING_SOURCE_ID", nullable = false)
    private Long funding_source_id;
    @Column(name = "VALIDATION_STATUS_ID", nullable = true)
    private Long validation_status_id;
    @Column(name = "FISCAL_YEAR", nullable = true)
    private Integer fiscal_year;
    @Column(name = "PERIOD_START", nullable = true)
    private java.time.LocalDate period_start;
    @Column(name = "PERIOD_END", nullable = true)
    private java.time.LocalDate period_end;
    @Column(name = "PHYSICAL_PROGRESS", nullable = false)
    private java.math.BigDecimal physical_progress;
    @Column(name = "EXECUTED_AMOUNT", nullable = true)
    private java.math.BigDecimal executed_amount;
    @Column(name = "CURRENCY", nullable = true)
    private String currency;
    @Column(name = "DELIVERED_OUTPUT", nullable = false)
    private String delivered_output;
    @Column(name = "EVIDENCE_REFERENCE", nullable = false)
    private String evidence_reference;
    @Column(name = "RECORDED_AT", nullable = true)
    private java.time.OffsetDateTime recorded_at;
    @Column(name = "RECORDED_BY_ID", nullable = false)
    private Long recorded_by_id;
    @Column(name = "VALIDATED_BY_ID", nullable = false)
    private Long validated_by_id;
    @Column(name = "VALIDATED_AT", nullable = false)
    private java.time.OffsetDateTime validated_at;
    @Column(name = "VALIDATION_COMMENT", nullable = false)
    private String validation_comment;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getAction_id() { return action_id; }
    public void setAction_id(Long action_id) { this.action_id = action_id; }
    public Long getFunding_source_id() { return funding_source_id; }
    public void setFunding_source_id(Long funding_source_id) { this.funding_source_id = funding_source_id; }
    public Long getValidation_status_id() { return validation_status_id; }
    public void setValidation_status_id(Long validation_status_id) { this.validation_status_id = validation_status_id; }
    public Integer getFiscal_year() { return fiscal_year; }
    public void setFiscal_year(Integer fiscal_year) { this.fiscal_year = fiscal_year; }
    public java.time.LocalDate getPeriod_start() { return period_start; }
    public void setPeriod_start(java.time.LocalDate period_start) { this.period_start = period_start; }
    public java.time.LocalDate getPeriod_end() { return period_end; }
    public void setPeriod_end(java.time.LocalDate period_end) { this.period_end = period_end; }
    public java.math.BigDecimal getPhysical_progress() { return physical_progress; }
    public void setPhysical_progress(java.math.BigDecimal physical_progress) { this.physical_progress = physical_progress; }
    public java.math.BigDecimal getExecuted_amount() { return executed_amount; }
    public void setExecuted_amount(java.math.BigDecimal executed_amount) { this.executed_amount = executed_amount; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public String getDelivered_output() { return delivered_output; }
    public void setDelivered_output(String delivered_output) { this.delivered_output = delivered_output; }
    public String getEvidence_reference() { return evidence_reference; }
    public void setEvidence_reference(String evidence_reference) { this.evidence_reference = evidence_reference; }
    public java.time.OffsetDateTime getRecorded_at() { return recorded_at; }
    public void setRecorded_at(java.time.OffsetDateTime recorded_at) { this.recorded_at = recorded_at; }
    public Long getRecorded_by_id() { return recorded_by_id; }
    public void setRecorded_by_id(Long recorded_by_id) { this.recorded_by_id = recorded_by_id; }
    public Long getValidated_by_id() { return validated_by_id; }
    public void setValidated_by_id(Long validated_by_id) { this.validated_by_id = validated_by_id; }
    public java.time.OffsetDateTime getValidated_at() { return validated_at; }
    public void setValidated_at(java.time.OffsetDateTime validated_at) { this.validated_at = validated_at; }
    public String getValidation_comment() { return validation_comment; }
    public void setValidation_comment(String validation_comment) { this.validation_comment = validation_comment; }
}
