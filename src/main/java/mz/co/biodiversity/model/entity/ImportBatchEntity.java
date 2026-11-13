package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "ImportBatchEntity.findAll", query = "SELECT e FROM ImportBatchEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "ImportBatchEntity.findById", query = "SELECT e FROM ImportBatchEntity e WHERE e.id = :id"),
    @NamedQuery(name = "ImportBatchEntity.countAll", query = "SELECT COUNT(e) FROM ImportBatchEntity e"),
    @NamedQuery(name = "ImportBatchEntity.findByStatus", query = "SELECT e FROM ImportBatchEntity e WHERE e.status = :status ORDER BY e.id DESC"),
    @NamedQuery(name = "ImportBatchEntity.findByCreatedById", query = "SELECT e FROM ImportBatchEntity e WHERE e.created_by_id = :createdById ORDER BY e.id DESC")
})
@Entity
@Table(name = "IMPORT_BATCH")
public class ImportBatchEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "SOURCE_SYSTEM", nullable = true)
    private String source_system;
    @Column(name = "FILE_NAME", nullable = false)
    private String file_name;
    @Column(name = "CHECKSUM", nullable = false)
    private String checksum;
    @Column(name = "STATUS", nullable = true)
    private String status;
    @Column(name = "TOTAL_RECORDS", nullable = true)
    private Integer total_records;
    @Column(name = "VALID_RECORDS", nullable = true)
    private Integer valid_records;
    @Column(name = "REJECTED_RECORDS", nullable = true)
    private Integer rejected_records;
    @Column(name = "STARTED_AT", nullable = true)
    private java.time.OffsetDateTime started_at;
    @Column(name = "COMPLETED_AT", nullable = false)
    private java.time.OffsetDateTime completed_at;
    @Column(name = "ERROR_MESSAGE", nullable = false)
    private String error_message;
    @Column(name = "CREATED_BY_ID", nullable = false)
    private Long created_by_id;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getSource_system() { return source_system; }
    public void setSource_system(String source_system) { this.source_system = source_system; }
    public String getFile_name() { return file_name; }
    public void setFile_name(String file_name) { this.file_name = file_name; }
    public String getChecksum() { return checksum; }
    public void setChecksum(String checksum) { this.checksum = checksum; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Integer getTotal_records() { return total_records; }
    public void setTotal_records(Integer total_records) { this.total_records = total_records; }
    public Integer getValid_records() { return valid_records; }
    public void setValid_records(Integer valid_records) { this.valid_records = valid_records; }
    public Integer getRejected_records() { return rejected_records; }
    public void setRejected_records(Integer rejected_records) { this.rejected_records = rejected_records; }
    public java.time.OffsetDateTime getStarted_at() { return started_at; }
    public void setStarted_at(java.time.OffsetDateTime started_at) { this.started_at = started_at; }
    public java.time.OffsetDateTime getCompleted_at() { return completed_at; }
    public void setCompleted_at(java.time.OffsetDateTime completed_at) { this.completed_at = completed_at; }
    public String getError_message() { return error_message; }
    public void setError_message(String error_message) { this.error_message = error_message; }
    public Long getCreated_by_id() { return created_by_id; }
    public void setCreated_by_id(Long created_by_id) { this.created_by_id = created_by_id; }
}
