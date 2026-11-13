package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries(
{ @NamedQuery(name = "UserAccountEntity.findAll", query = "SELECT e FROM UserAccountEntity e ORDER BY e.id DESC"),
		@NamedQuery(name = "UserAccountEntity.findById", query = "SELECT e FROM UserAccountEntity e WHERE e.id = :id"),
		@NamedQuery(name = "UserAccountEntity.countAll", query = "SELECT COUNT(e) FROM UserAccountEntity e"),
		@NamedQuery(name = "UserAccountEntity.findByEmail", query = "SELECT e FROM UserAccountEntity e WHERE e.email = :email"),
		@NamedQuery(name = "UserAccountEntity.findByUsername", query = "SELECT e FROM UserAccountEntity e WHERE e.username = :username"),
		@NamedQuery(name = "UserAccountEntity.findByInstitutionId", query = "SELECT e FROM UserAccountEntity e WHERE e.institution_id = :institutionId ORDER BY e.id DESC"),
		@NamedQuery(name = "UserAccountEntity.findByRoleId", query = "SELECT e FROM UserAccountEntity e WHERE e.role_id = :roleId ORDER BY e.id DESC") })
@Entity
@Table(name = "USER_ACCOUNT")
public class UserAccountEntity implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "INSTITUTION_ID", nullable = false)
	private Long institution_id;

	@Column(name = "ROLE_ID", nullable = true)
	private Long role_id;

	@Column(name = "NAME", nullable = true)
	private String name;

	@Column(name = "EMAIL", nullable = true)
	private String email;

	@Column(name = "USERNAME", nullable = false)
	private String username;

	@Column(name = "PASSWORD_HASH", nullable = false)
	private String password_hash;

	@Column(name = "STATUS", nullable = true)
	private String status;

	@Column(name = "LAST_LOGIN_AT", nullable = false)
	private java.time.OffsetDateTime last_login_at;

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

	public Long getInstitution_id()
	{
		return institution_id;
	}

	public void setInstitution_id(Long institution_id)
	{
		this.institution_id = institution_id;
	}

	public Long getRole_id()
	{
		return role_id;
	}

	public void setRole_id(Long role_id)
	{
		this.role_id = role_id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword_hash()
	{
		return password_hash;
	}

	public void setPassword_hash(String password_hash)
	{
		this.password_hash = password_hash;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public java.time.OffsetDateTime getLast_login_at()
	{
		return last_login_at;
	}

	public void setLast_login_at(java.time.OffsetDateTime last_login_at)
	{
		this.last_login_at = last_login_at;
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
