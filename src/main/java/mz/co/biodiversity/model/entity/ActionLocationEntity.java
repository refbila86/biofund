package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "ActionLocationEntity.findAll", query = "SELECT e FROM ActionLocationEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionLocationEntity.findById", query = "SELECT e FROM ActionLocationEntity e WHERE e.id = :id"),
    @NamedQuery(name = "ActionLocationEntity.countAll", query = "SELECT COUNT(e) FROM ActionLocationEntity e"),
    @NamedQuery(name = "ActionLocationEntity.findByActionId", query = "SELECT e FROM ActionLocationEntity e WHERE e.action_id = :actionId ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionLocationEntity.findByLocationId", query = "SELECT e FROM ActionLocationEntity e WHERE e.location_id = :locationId ORDER BY e.id DESC")
})
@Entity
@Table(name = "ACTION_LOCATION")
public class ActionLocationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTION_ID", nullable = true)
    private Long action_id;
    @Column(name = "LOCATION_ID", nullable = true)
    private Long location_id;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getAction_id() { return action_id; }
    public void setAction_id(Long action_id) { this.action_id = action_id; }
    public Long getLocation_id() { return location_id; }
    public void setLocation_id(Long location_id) { this.location_id = location_id; }
}
