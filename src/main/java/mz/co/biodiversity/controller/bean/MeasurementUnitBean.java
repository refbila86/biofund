package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.MeasurementUnitEntity;
import mz.co.biodiversity.service.IMeasurementUnitService;
@Component
@Scope("view")
public class MeasurementUnitBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IMeasurementUnitService service;
    private MeasurementUnitEntity selected = new MeasurementUnitEntity();
    public MeasurementUnitBean(IMeasurementUnitService service) { this.service = service; }
    public List<MeasurementUnitEntity> getItems() { return service.findAll(); }
    public MeasurementUnitEntity getSelected() { return selected; }
    public void setSelected(MeasurementUnitEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new MeasurementUnitEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
