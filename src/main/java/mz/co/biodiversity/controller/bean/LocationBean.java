package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.LocationEntity;
import mz.co.biodiversity.service.ILocationService;
@Component
@Scope("view")
public class LocationBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final ILocationService service;
    private LocationEntity selected = new LocationEntity();
    public LocationBean(ILocationService service) { this.service = service; }
    public List<LocationEntity> getItems() { return service.findAll(); }
    public LocationEntity getSelected() { return selected; }
    public void setSelected(LocationEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new LocationEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
