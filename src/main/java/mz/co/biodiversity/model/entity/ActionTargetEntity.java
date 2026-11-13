package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "ActionTargetEntity.findAll", query = "SELECT e FROM ActionTargetEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionTargetEntity.findById", query = "SELECT e FROM ActionTargetEntity e WHERE e.id = :id"),
    @NamedQuery(name = "ActionTargetEntity.countAll", query = "SELECT COUNT(e) FROM ActionTargetEntity e"),
    @NamedQuery(name = "ActionTargetEntity.findByActionId", query = "SELECT e FROM ActionTargetEntity e WHERE e.action_id = :actionId ORDER BY e.id DESC"),
    @NamedQuery(name = "ActionTargetEntity.findByTargetId", query = "SELECT e FROM ActionTargetEntity e WHERE e.target_id = :targetId ORDER BY e.id DESC")
})
@Entity
@Table(name = "ACTION_TARGET")
public class ActionTargetEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTION_ID", nullable = true)
    private Long action_id;
    @Column(name = "TARGET_ID", nullable = true)
    private Long target_id;
    @Column(name = "EXPECTED_CONTRIBUTION", nullable = false)
    private String expected_contribution;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getAction_id() { return action_id; }
    public void setAction_id(Long action_id) { this.action_id = action_id; }
    public Long getTarget_id() { return target_id; }
    public void setTarget_id(Long target_id) { this.target_id = target_id; }
    public String getExpected_contribution() { return expected_contribution; }
    public void setExpected_contribution(String expected_contribution) { this.expected_contribution = expected_contribution; }
}
