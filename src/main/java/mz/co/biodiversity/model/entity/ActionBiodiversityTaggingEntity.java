package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries(
{ @NamedQuery(name = "ActionBiodiversityTaggingEntity.findAll", query = "SELECT e FROM ActionBiodiversityTaggingEntity e ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionBiodiversityTaggingEntity.findById", query = "SELECT e FROM ActionBiodiversityTaggingEntity e WHERE e.id = :id"),
		@NamedQuery(name = "ActionBiodiversityTaggingEntity.countAll", query = "SELECT COUNT(e) FROM ActionBiodiversityTaggingEntity e"),
		@NamedQuery(name = "ActionBiodiversityTaggingEntity.findByActionId", query = "SELECT e FROM ActionBiodiversityTaggingEntity e WHERE e.action_id = :actionId ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionBiodiversityTaggingEntity.findByBiodiversityClassificationId", query = "SELECT e FROM ActionBiodiversityTaggingEntity e WHERE e.biodiversity_classification_id = :biodiversityClassificationId ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionBiodiversityTaggingEntity.findByValidationStatusId", query = "SELECT e FROM ActionBiodiversityTaggingEntity e WHERE e.validation_status_id = :validationStatusId ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionBiodiversityTaggingEntity.findByClassifiedById", query = "SELECT e FROM ActionBiodiversityTaggingEntity e WHERE e.classified_by_id = :classifiedById ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionBiodiversityTaggingEntity.findByValidatedById", query = "SELECT e FROM ActionBiodiversityTaggingEntity e WHERE e.validated_by_id = :validatedById ORDER BY e.id DESC") })
@Entity
@Table(name = "ACTION_BIODIVERSITY_TAGGING")
public class ActionBiodiversityTaggingEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "ACTION_ID", nullable = true)
	private Long action_id;
	
	@Column(name = "BIODIVERSITY_CLASSIFICATION_ID", nullable = true)
	private Long biodiversity_classification_id;
	
	@Column(name = "VALIDATION_STATUS_ID", nullable = true)
	private Long validation_status_id;
	
	@Column(name = "ASSIGNED_PERCENTAGE", nullable = false)
	private java.math.BigDecimal assigned_percentage;
	
	@Column(name = "JUSTIFICATION", nullable = true)
	private String justification;
	
	@Column(name = "EVIDENCE_REFERENCE", nullable = false)
	private String evidence_reference;
	
	@Column(name = "CLASSIFICATION_DATE", nullable = true)
	private java.time.LocalDate classification_date;
	
	@Column(name = "CLASSIFIED_BY_ID", nullable = false)
	private Long classified_by_id;
	
	@Column(name = "VALIDATED_BY_ID", nullable = false)
	private Long validated_by_id;
	
	@Column(name = "VALIDATED_AT", nullable = false)
	private java.time.OffsetDateTime validated_at;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getAction_id()
	{
		return action_id;
	}

	public void setAction_id(Long action_id)
	{
		this.action_id = action_id;
	}

	public Long getBiodiversity_classification_id()
	{
		return biodiversity_classification_id;
	}

	public void setBiodiversity_classification_id(Long biodiversity_classification_id)
	{
		this.biodiversity_classification_id = biodiversity_classification_id;
	}

	public Long getValidation_status_id()
	{
		return validation_status_id;
	}

	public void setValidation_status_id(Long validation_status_id)
	{
		this.validation_status_id = validation_status_id;
	}

	public java.math.BigDecimal getAssigned_percentage()
	{
		return assigned_percentage;
	}

	public void setAssigned_percentage(java.math.BigDecimal assigned_percentage)
	{
		this.assigned_percentage = assigned_percentage;
	}

	public String getJustification()
	{
		return justification;
	}

	public void setJustification(String justification)
	{
		this.justification = justification;
	}

	public String getEvidence_reference()
	{
		return evidence_reference;
	}

	public void setEvidence_reference(String evidence_reference)
	{
		this.evidence_reference = evidence_reference;
	}

	public java.time.LocalDate getClassification_date()
	{
		return classification_date;
	}

	public void setClassification_date(java.time.LocalDate classification_date)
	{
		this.classification_date = classification_date;
	}

	public Long getClassified_by_id()
	{
		return classified_by_id;
	}

	public void setClassified_by_id(Long classified_by_id)
	{
		this.classified_by_id = classified_by_id;
	}

	public Long getValidated_by_id()
	{
		return validated_by_id;
	}

	public void setValidated_by_id(Long validated_by_id)
	{
		this.validated_by_id = validated_by_id;
	}

	public java.time.OffsetDateTime getValidated_at()
	{
		return validated_at;
	}

	public void setValidated_at(java.time.OffsetDateTime validated_at)
	{
		this.validated_at = validated_at;
	}
}
