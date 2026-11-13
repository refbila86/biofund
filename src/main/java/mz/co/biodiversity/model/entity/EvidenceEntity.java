package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "EvidenceEntity.findAll", query = "SELECT e FROM EvidenceEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "EvidenceEntity.findById", query = "SELECT e FROM EvidenceEntity e WHERE e.id = :id"),
    @NamedQuery(name = "EvidenceEntity.countAll", query = "SELECT COUNT(e) FROM EvidenceEntity e"),
    @NamedQuery(name = "EvidenceEntity.findByActionId", query = "SELECT e FROM EvidenceEntity e WHERE e.action_id = :actionId ORDER BY e.id DESC"),
    @NamedQuery(name = "EvidenceEntity.findByUploadedById", query = "SELECT e FROM EvidenceEntity e WHERE e.uploaded_by_id = :uploadedById ORDER BY e.id DESC")
})
@Entity
@Table(name = "EVIDENCE")
public class EvidenceEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "ACTION_ID", nullable = false)
    private Long action_id;
    @Column(name = "FILE_NAME", nullable = false)
    private String file_name;
    @Column(name = "DOCUMENT_TYPE", nullable = false)
    private String document_type;
    @Column(name = "REFERENCE", nullable = false)
    private String reference;
    @Column(name = "CONTENT_HASH", nullable = false)
    private String content_hash;
    @Column(name = "DOCUMENT_DATE", nullable = false)
    private java.time.LocalDate document_date;
    @Column(name = "UPLOADED_BY_ID", nullable = false)
    private Long uploaded_by_id;
    @Column(name = "UPLOADED_AT", nullable = true)
    private java.time.OffsetDateTime uploaded_at;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getAction_id() { return action_id; }
    public void setAction_id(Long action_id) { this.action_id = action_id; }
    public String getFile_name() { return file_name; }
    public void setFile_name(String file_name) { this.file_name = file_name; }
    public String getDocument_type() { return document_type; }
    public void setDocument_type(String document_type) { this.document_type = document_type; }
    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }
    public String getContent_hash() { return content_hash; }
    public void setContent_hash(String content_hash) { this.content_hash = content_hash; }
    public java.time.LocalDate getDocument_date() { return document_date; }
    public void setDocument_date(java.time.LocalDate document_date) { this.document_date = document_date; }
    public Long getUploaded_by_id() { return uploaded_by_id; }
    public void setUploaded_by_id(Long uploaded_by_id) { this.uploaded_by_id = uploaded_by_id; }
    public java.time.OffsetDateTime getUploaded_at() { return uploaded_at; }
    public void setUploaded_at(java.time.OffsetDateTime uploaded_at) { this.uploaded_at = uploaded_at; }
}
