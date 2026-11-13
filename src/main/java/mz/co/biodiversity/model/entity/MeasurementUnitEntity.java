package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "MeasurementUnitEntity.findAll", query = "SELECT e FROM MeasurementUnitEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "MeasurementUnitEntity.findById", query = "SELECT e FROM MeasurementUnitEntity e WHERE e.id = :id"),
    @NamedQuery(name = "MeasurementUnitEntity.countAll", query = "SELECT COUNT(e) FROM MeasurementUnitEntity e"),
    @NamedQuery(name = "MeasurementUnitEntity.findByCode", query = "SELECT e FROM MeasurementUnitEntity e WHERE e.code = :code ORDER BY e.id DESC")
})
@Entity
@Table(name = "MEASUREMENT_UNIT")
public class MeasurementUnitEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = true)
    private String code;
    @Column(name = "NAME", nullable = true)
    private String name;
    @Column(name = "SYMBOL", nullable = false)
    private String symbol;
    @Column(name = "DATA_TYPE", nullable = true)
    private String data_type;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getSymbol() { return symbol; }
    public void setSymbol(String symbol) { this.symbol = symbol; }
    public String getData_type() { return data_type; }
    public void setData_type(String data_type) { this.data_type = data_type; }
}
