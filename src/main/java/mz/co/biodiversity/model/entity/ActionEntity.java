package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries(
{ @NamedQuery(name = "ActionEntity.findAll", query = "SELECT e FROM ActionEntity e ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionEntity.findById", query = "SELECT e FROM ActionEntity e WHERE e.id = :id"),
		@NamedQuery(name = "ActionEntity.countAll", query = "SELECT COUNT(e) FROM ActionEntity e"),
		@NamedQuery(name = "ActionEntity.findByCode", query = "SELECT e FROM ActionEntity e WHERE e.code = :code ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionEntity.findByProjectId", query = "SELECT e FROM ActionEntity e WHERE e.project_id = :projectId ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionEntity.findByInstitutionId", query = "SELECT e FROM ActionEntity e WHERE e.institution_id = :institutionId ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionEntity.findByInterventionTypeId", query = "SELECT e FROM ActionEntity e WHERE e.intervention_type_id = :interventionTypeId ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionEntity.findByActionStatusId", query = "SELECT e FROM ActionEntity e WHERE e.action_status_id = :actionStatusId ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionEntity.findByCreatedById", query = "SELECT e FROM ActionEntity e WHERE e.created_by_id = :createdById ORDER BY e.id DESC") })
@Entity
@Table(name = "ACTION")
public class ActionEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "PROJECT_ID", nullable = false)
	private Long project_id;
	@Column(name = "INSTITUTION_ID", nullable = true)
	private Long institution_id;
	@Column(name = "INTERVENTION_TYPE_ID", nullable = false)
	private Long intervention_type_id;
	@Column(name = "ACTION_STATUS_ID", nullable = true)
	private Long action_status_id;
	@Column(name = "CODE", nullable = true)
	private String code;
	@Column(name = "TITLE", nullable = true)
	private String title;
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	@Column(name = "IMPLEMENTING_UNIT", nullable = false)
	private String implementing_unit;
	@Column(name = "START_DATE", nullable = false)
	private java.time.LocalDate start_date;
	@Column(name = "PLANNED_END_DATE", nullable = false)
	private java.time.LocalDate planned_end_date;
	@Column(name = "ACTUAL_END_DATE", nullable = false)
	private java.time.LocalDate actual_end_date;
	@Column(name = "REFERENCE_CURRENCY", nullable = true)
	private String reference_currency;
	@Column(name = "CREATED_BY_ID", nullable = false)
	private Long created_by_id;
	@Column(name = "CREATED_AT", nullable = true)
	private java.time.OffsetDateTime created_at;
	@Column(name = "UPDATED_AT", nullable = true)
	private java.time.OffsetDateTime updated_at;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getProject_id()
	{
		return project_id;
	}

	public void setProject_id(Long project_id)
	{
		this.project_id = project_id;
	}

	public Long getInstitution_id()
	{
		return institution_id;
	}

	public void setInstitution_id(Long institution_id)
	{
		this.institution_id = institution_id;
	}

	public Long getIntervention_type_id()
	{
		return intervention_type_id;
	}

	public void setIntervention_type_id(Long intervention_type_id)
	{
		this.intervention_type_id = intervention_type_id;
	}

	public Long getAction_status_id()
	{
		return action_status_id;
	}

	public void setAction_status_id(Long action_status_id)
	{
		this.action_status_id = action_status_id;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getImplementing_unit()
	{
		return implementing_unit;
	}

	public void setImplementing_unit(String implementing_unit)
	{
		this.implementing_unit = implementing_unit;
	}

	public java.time.LocalDate getStart_date()
	{
		return start_date;
	}

	public void setStart_date(java.time.LocalDate start_date)
	{
		this.start_date = start_date;
	}

	public java.time.LocalDate getPlanned_end_date()
	{
		return planned_end_date;
	}

	public void setPlanned_end_date(java.time.LocalDate planned_end_date)
	{
		this.planned_end_date = planned_end_date;
	}

	public java.time.LocalDate getActual_end_date()
	{
		return actual_end_date;
	}

	public void setActual_end_date(java.time.LocalDate actual_end_date)
	{
		this.actual_end_date = actual_end_date;
	}

	public String getReference_currency()
	{
		return reference_currency;
	}

	public void setReference_currency(String reference_currency)
	{
		this.reference_currency = reference_currency;
	}

	public Long getCreated_by_id()
	{
		return created_by_id;
	}

	public void setCreated_by_id(Long created_by_id)
	{
		this.created_by_id = created_by_id;
	}

	public java.time.OffsetDateTime getCreated_at()
	{
		return created_at;
	}

	public void setCreated_at(java.time.OffsetDateTime created_at)
	{
		this.created_at = created_at;
	}

	public java.time.OffsetDateTime getUpdated_at()
	{
		return updated_at;
	}

	public void setUpdated_at(java.time.OffsetDateTime updated_at)
	{
		this.updated_at = updated_at;
	}
}
