package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "ActionIndicatorEntity.findAll", query = "SELECT e FROM ActionIndicatorEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionIndicatorEntity.findById", query = "SELECT e FROM ActionIndicatorEntity e WHERE e.id = :id"),
    @NamedQuery(name = "ActionIndicatorEntity.countAll", query = "SELECT COUNT(e) FROM ActionIndicatorEntity e"),
    @NamedQuery(name = "ActionIndicatorEntity.findByActionId", query = "SELECT e FROM ActionIndicatorEntity e WHERE e.action_id = :actionId ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionIndicatorEntity.findByIndicatorId", query = "SELECT e FROM ActionIndicatorEntity e WHERE e.indicator_id = :indicatorId ORDER BY e.id DESC")
})
@Entity
@Table(name = "ACTION_INDICATOR")
public class ActionIndicatorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTION_ID", nullable = true)
    private Long action_id;
    @Column(name = "INDICATOR_ID", nullable = true)
    private Long indicator_id;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getAction_id() { return action_id; }
    public void setAction_id(Long action_id) { this.action_id = action_id; }
    public Long getIndicator_id() { return indicator_id; }
    public void setIndicator_id(Long indicator_id) { this.indicator_id = indicator_id; }
}
