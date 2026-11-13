package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "ActionStatusEntity.findAll", query = "SELECT e FROM ActionStatusEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionStatusEntity.findById", query = "SELECT e FROM ActionStatusEntity e WHERE e.id = :id"),
    @NamedQuery(name = "ActionStatusEntity.countAll", query = "SELECT COUNT(e) FROM ActionStatusEntity e"),
    @NamedQuery(name = "ActionStatusEntity.findByCode", query = "SELECT e FROM ActionStatusEntity e WHERE e.code = :code ORDER BY e.id DESC")
})
@Entity
@Table(name = "ACTION_STATUS")
public class ActionStatusEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = true)
    private String code;
    @Column(name = "DESCRIPTION", nullable = true)
    private String description;
    @Column(name = "TERMINAL", nullable = true)
    private Boolean terminal;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Boolean getTerminal() { return terminal; }
    public void setTerminal(Boolean terminal) { this.terminal = terminal; }
}
