package mz.co.biodiversity.model.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.*;
import java.math.BigDecimal;

@NamedQueries({
    @NamedQuery(name = "LocationEntity.findAll", query = "SELECT e FROM LocationEntity e ORDER BY e.id DESC"),
    @NamedQuery(name = "LocationEntity.findById", query = "SELECT e FROM LocationEntity e WHERE e.id = :id"),
    @NamedQuery(name = "LocationEntity.countAll", query = "SELECT COUNT(e) FROM LocationEntity e"),
    @NamedQuery(name = "LocationEntity.findByCode", query = "SELECT e FROM LocationEntity e WHERE e.code = :code ORDER BY e.id DESC"),
    @NamedQuery(name = "LocationEntity.findByActive", query = "SELECT e FROM LocationEntity e WHERE e.active = :active ORDER BY e.id DESC")
})
@Entity
@Table(name = "LOCATION")
public class LocationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "CODE", nullable = false)
    private String code;
    @Column(name = "PROVINCE", nullable = true)
    private String province;
    @Column(name = "DISTRICT", nullable = false)
    private String district;
    @Column(name = "ADMINISTRATIVE_POST", nullable = false)
    private String administrative_post;
    @Column(name = "LOCALITY", nullable = false)
    private String locality;
    @Column(name = "CONSERVATION_AREA", nullable = false)
    private String conservation_area;
    @Column(name = "KEY_BIODIVERSITY_AREA", nullable = false)
    private String key_biodiversity_area;
    @Column(name = "ECOSYSTEM", nullable = false)
    private String ecosystem;
    @Column(name = "LATITUDE", nullable = false)
    private java.math.BigDecimal latitude;
    @Column(name = "LONGITUDE", nullable = false)
    private java.math.BigDecimal longitude;
    @Column(name = "GEOGRAPHIC_REFERENCE", nullable = false)
    private String geographic_reference;
    @Column(name = "ACTIVE", nullable = true)
    private Boolean active;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }
    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }
    public String getAdministrative_post() { return administrative_post; }
    public void setAdministrative_post(String administrative_post) { this.administrative_post = administrative_post; }
    public String getLocality() { return locality; }
    public void setLocality(String locality) { this.locality = locality; }
    public String getConservation_area() { return conservation_area; }
    public void setConservation_area(String conservation_area) { this.conservation_area = conservation_area; }
    public String getKey_biodiversity_area() { return key_biodiversity_area; }
    public void setKey_biodiversity_area(String key_biodiversity_area) { this.key_biodiversity_area = key_biodiversity_area; }
    public String getEcosystem() { return ecosystem; }
    public void setEcosystem(String ecosystem) { this.ecosystem = ecosystem; }
    public java.math.BigDecimal getLatitude() { return latitude; }
    public void setLatitude(java.math.BigDecimal latitude) { this.latitude = latitude; }
    public java.math.BigDecimal getLongitude() { return longitude; }
    public void setLongitude(java.math.BigDecimal longitude) { this.longitude = longitude; }
    public String getGeographic_reference() { return geographic_reference; }
    public void setGeographic_reference(String geographic_reference) { this.geographic_reference = geographic_reference; }
    public Boolean getActive() { return active; }
    public void setActive(Boolean active) { this.active = active; }
}
