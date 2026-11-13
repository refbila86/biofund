package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries(
{ @NamedQuery(name = "ActionBudgetEntity.findAll", query = "SELECT e FROM ActionBudgetEntity e ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionBudgetEntity.findById", query = "SELECT e FROM ActionBudgetEntity e WHERE e.id = :id"),
		@NamedQuery(name = "ActionBudgetEntity.countAll", query = "SELECT COUNT(e) FROM ActionBudgetEntity e"),
		@NamedQuery(name = "ActionBudgetEntity.findByActionId", query = "SELECT e FROM ActionBudgetEntity e WHERE e.action_id = :actionId ORDER BY e.id DESC"),
		@NamedQuery(name = "ActionBudgetEntity.findByFundingSourceId", query = "SELECT e FROM ActionBudgetEntity e WHERE e.funding_source_id = :fundingSourceId ORDER BY e.id DESC") })
@Entity
@Table(name = "ACTION_BUDGET")
public class ActionBudgetEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "ACTION_ID", nullable = true)
	private Long action_id;
	
	@Column(name = "FUNDING_SOURCE_ID", nullable = true)
	private Long funding_source_id;
	
	@Column(name = "FISCAL_YEAR", nullable = true)
	private Integer fiscal_year;
	
	@Column(name = "APPROVED_AMOUNT", nullable = true)
	private java.math.BigDecimal approved_amount;
	
	@Column(name = "REVISED_AMOUNT", nullable = true)
	private java.math.BigDecimal revised_amount;
	
	@Column(name = "CURRENCY", nullable = true)
	private String currency;
	
	@Column(name = "BUDGET_CLASSIFIER", nullable = false)
	private String budget_classifier;
	
	@Column(name = "PLANNING_INSTRUMENT", nullable = false)
	private String planning_instrument;
	
	@Column(name = "VERSION", nullable = true)
	private Integer version;
	
	@Column(name = "CURRENT_VERSION", nullable = true)
	private Boolean current_version;
	
	@Column(name = "UPDATED_AT", nullable = true)
	private java.time.OffsetDateTime updated_at;
	
	@Column(name = "UPDATED_POR", nullable = false)
	private Long updated_por;

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

	public Long getFunding_source_id()
	{
		return funding_source_id;
	}

	public void setFunding_source_id(Long funding_source_id)
	{
		this.funding_source_id = funding_source_id;
	}

	public Integer getFiscal_year()
	{
		return fiscal_year;
	}

	public void setFiscal_year(Integer fiscal_year)
	{
		this.fiscal_year = fiscal_year;
	}

	public java.math.BigDecimal getApproved_amount()
	{
		return approved_amount;
	}

	public void setApproved_amount(java.math.BigDecimal approved_amount)
	{
		this.approved_amount = approved_amount;
	}

	public java.math.BigDecimal getRevised_amount()
	{
		return revised_amount;
	}

	public void setRevised_amount(java.math.BigDecimal revised_amount)
	{
		this.revised_amount = revised_amount;
	}

	public String getCurrency()
	{
		return currency;
	}

	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	public String getBudget_classifier()
	{
		return budget_classifier;
	}

	public void setBudget_classifier(String budget_classifier)
	{
		this.budget_classifier = budget_classifier;
	}

	public String getPlanning_instrument()
	{
		return planning_instrument;
	}

	public void setPlanning_instrument(String planning_instrument)
	{
		this.planning_instrument = planning_instrument;
	}

	public Integer getVersion()
	{
		return version;
	}

	public void setVersion(Integer version)
	{
		this.version = version;
	}

	public Boolean getCurrent_version()
	{
		return current_version;
	}

	public void setCurrent_version(Boolean current_version)
	{
		this.current_version = current_version;
	}

	public java.time.OffsetDateTime getUpdated_at()
	{
		return updated_at;
	}

	public void setUpdated_at(java.time.OffsetDateTime updated_at)
	{
		this.updated_at = updated_at;
	}

	public Long getUpdated_por()
	{
		return updated_por;
	}

	public void setUpdated_por(Long updated_por)
	{
		this.updated_por = updated_por;
	}
}
