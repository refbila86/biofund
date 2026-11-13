package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "IndicatorEntity.findAll", query = "SELECT e FROM IndicatorEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorEntity.findById", query = "SELECT e FROM IndicatorEntity e WHERE e.id = :id"),
    @NamedQuery(name = "IndicatorEntity.countAll", query = "SELECT COUNT(e) FROM IndicatorEntity e"),
    @NamedQuery(name = "IndicatorEntity.findByCode", query = "SELECT e FROM IndicatorEntity e WHERE e.code = :code ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorEntity.findByActive", query = "SELECT e FROM IndicatorEntity e WHERE e.active = :active ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorEntity.findByTargetId", query = "SELECT e FROM IndicatorEntity e WHERE e.target_id = :targetId ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorEntity.findByDataSourceId", query = "SELECT e FROM IndicatorEntity e WHERE e.data_source_id = :dataSourceId ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorEntity.findByResponsibleInstitutionId", query = "SELECT e FROM IndicatorEntity e WHERE e.responsible_institution_id = :responsibleInstitutionId ORDER BY e.id DESC"),
    @NamedQuery(name = "IndicatorEntity.findByMeasurementUnitId", query = "SELECT e FROM IndicatorEntity e WHERE e.measurement_unit_id = :measurementUnitId ORDER BY e.id DESC")
})
@Entity
@Table(name = "INDICATOR")
public class IndicatorEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TARGET_ID", nullable = false)
    private Long target_id;
    @Column(name = "DATA_SOURCE_ID", nullable = false)
    private Long data_source_id;
    @Column(name = "RESPONSIBLE_INSTITUTION_ID", nullable = false)
    private Long responsible_institution_id;
    @Column(name = "MEASUREMENT_UNIT_ID", nullable = true)
    private Long measurement_unit_id;
    @Column(name = "CODE", nullable = true)
    private String code;
    @Column(name = "NAME", nullable = true)
    private String name;
    @Column(name = "DEFINITION", nullable = true)
    private String definition;
    @Column(name = "FORMULA", nullable = false)
    private String formula;
    @Column(name = "FREQUENCY", nullable = true)
    private String frequency;
    @Column(name = "TARGET_DIRECTION", nullable = true)
    private String target_direction;
    @Column(name = "CONFIDENCE_LEVEL", nullable = false)
    private String confidence_level;
    @Column(name = "COLLECTION_METHOD", nullable = false)
    private String collection_method;
    @Column(name = "ACTIVE", nullable = true)
    private Boolean active;
    @Column(name = "CREATED_AT", nullable = true)
    private java.time.OffsetDateTime created_at;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getTarget_id() { return target_id; }
    public void setTarget_id(Long target_id) { this.target_id = target_id; }
    public Long getData_source_id() { return data_source_id; }
    public void setData_source_id(Long data_source_id) { this.data_source_id = data_source_id; }
    public Long getResponsible_institution_id() { return responsible_institution_id; }
    public void setResponsible_institution_id(Long responsible_institution_id) { this.responsible_institution_id = responsible_institution_id; }
    public Long getMeasurement_unit_id() { return measurement_unit_id; }
    public void setMeasurement_unit_id(Long measurement_unit_id) { this.measurement_unit_id = measurement_unit_id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDefinition() { return definition; }
    public void setDefinition(String definition) { this.definition = definition; }
    public String getFormula() { return formula; }
    public void setFormula(String formula) { this.formula = formula; }
    public String getFrequency() { return frequency; }
    public void setFrequency(String frequency) { this.frequency = frequency; }
    public String getTarget_direction() { return target_direction; }
    public void setTarget_direction(String target_direction) { this.target_direction = target_direction; }
    public String getConfidence_level() { return confidence_level; }
    public void setConfidence_level(String confidence_level) { this.confidence_level = confidence_level; }
    public String getCollection_method() { return collection_method; }
    public void setCollection_method(String collection_method) { this.collection_method = collection_method; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
    public java.time.OffsetDateTime getCreated_at() { return created_at; }
    public void setCreated_at(java.time.OffsetDateTime created_at) { this.created_at = created_at; }
}
