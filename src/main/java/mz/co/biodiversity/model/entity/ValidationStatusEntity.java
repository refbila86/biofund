package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "ValidationStatusEntity.findAll", query = "SELECT e FROM ValidationStatusEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "ValidationStatusEntity.findById", query = "SELECT e FROM ValidationStatusEntity e WHERE e.id = :id"),
    @NamedQuery(name = "ValidationStatusEntity.countAll", query = "SELECT COUNT(e) FROM ValidationStatusEntity e"),
    @NamedQuery(name = "ValidationStatusEntity.findByCode", query = "SELECT e FROM ValidationStatusEntity e WHERE e.code = :code ORDER BY e.id DESC")
})
@Entity
@Table(name = "VALIDATION_STATUS")
public class ValidationStatusEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = true)
    private String code;
    @Column(name = "DESCRIPTION", nullable = true)
    private String description;
    @Column(name = "ALLOWS_PUBLICATION", nullable = true)
    private Boolean allows_publication;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Boolean getAllows_publication() { return allows_publication; }
    public void setAllows_publication(Boolean allows_publication) { this.allows_publication = allows_publication; }
}
