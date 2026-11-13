package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "AuditHistoryEntity.findAll", query = "SELECT e FROM AuditHistoryEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "AuditHistoryEntity.findById", query = "SELECT e FROM AuditHistoryEntity e WHERE e.id = :id"),
    @NamedQuery(name = "AuditHistoryEntity.countAll", query = "SELECT COUNT(e) FROM AuditHistoryEntity e"),
    @NamedQuery(name = "AuditHistoryEntity.findByUserId", query = "SELECT e FROM AuditHistoryEntity e WHERE e.user_id = :userId ORDER BY e.id DESC")
})
@Entity
@Table(name = "AUDIT_HISTORY")
public class AuditHistoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "USER_ID", nullable = false)
    private Long user_id;
    @Column(name = "ENTITY_NAME", nullable = true)
    private String entity_name;
    @Column(name = "RECORD_ID", nullable = true)
    private String record_id;
    @Column(name = "OPERATION", nullable = true)
    private String operation;
    @Column(name = "PREVIOUS_VALUE", nullable = false)
    private String previous_value;
    @Column(name = "NEW_VALUE", nullable = false)
    private String new_value;
    @Column(name = "COMMENT", nullable = false)
    private String comment;
    @Column(name = "OPERATION_AT", nullable = true)
    private java.time.OffsetDateTime operation_at;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getUser_id() { return user_id; }
    public void setUser_id(Long user_id) { this.user_id = user_id; }
    public String getEntity_name() { return entity_name; }
    public void setEntity_name(String entity_name) { this.entity_name = entity_name; }
    public String getRecord_id() { return record_id; }
    public void setRecord_id(String record_id) { this.record_id = record_id; }
    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
    public String getPrevious_value() { return previous_value; }
    public void setPrevious_value(String previous_value) { this.previous_value = previous_value; }
    public String getNew_value() { return new_value; }
    public void setNew_value(String new_value) { this.new_value = new_value; }
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
    public java.time.OffsetDateTime getOperation_at() { return operation_at; }
    public void setOperation_at(java.time.OffsetDateTime operation_at) { this.operation_at = operation_at; }
}
