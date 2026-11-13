package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "DataSourceEntity.findAll", query = "SELECT e FROM DataSourceEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "DataSourceEntity.findById", query = "SELECT e FROM DataSourceEntity e WHERE e.id = :id"),
    @NamedQuery(name = "DataSourceEntity.countAll", query = "SELECT COUNT(e) FROM DataSourceEntity e"),
    @NamedQuery(name = "DataSourceEntity.findByActive", query = "SELECT e FROM DataSourceEntity e WHERE e.active = :active ORDER BY e.id DESC")
})
@Entity
@Table(name = "DATA_SOURCE")
public class DataSourceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME", nullable = true)
    private String name;
    @Column(name = "RESPONSIBLE_ENTITY", nullable = false)
    private String responsible_entity;
    @Column(name = "SOURCE_TYPE", nullable = false)
    private String source_type;
    @Column(name = "FREQUENCY", nullable = false)
    private String frequency;
    @Column(name = "REFERENCE_URL", nullable = false)
    private String reference_url;
    @Column(name = "CONTACT", nullable = false)
    private String contact;
    @Column(name = "ACTIVE", nullable = true)
    private Boolean active;
    @Column(name = "CREATED_AT", nullable = true)
    private java.time.OffsetDateTime created_at;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getResponsible_entity() { return responsible_entity; }
    public void setResponsible_entity(String responsible_entity) { this.responsible_entity = responsible_entity; }
    public String getSource_type() { return source_type; }
    public void setSource_type(String source_type) { this.source_type = source_type; }
    public String getFrequency() { return frequency; }
    public void setFrequency(String frequency) { this.frequency = frequency; }
    public String getReference_url() { return reference_url; }
    public void setReference_url(String reference_url) { this.reference_url = reference_url; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
    public java.time.OffsetDateTime getCreated_at() { return created_at; }
    public void setCreated_at(java.time.OffsetDateTime created_at) { this.created_at = created_at; }
}
