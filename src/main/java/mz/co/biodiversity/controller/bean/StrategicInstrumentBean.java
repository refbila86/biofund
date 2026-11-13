package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.StrategicInstrumentEntity;
import mz.co.biodiversity.service.IStrategicInstrumentService;
@Component
@Scope("view")
public class StrategicInstrumentBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IStrategicInstrumentService service;
    private StrategicInstrumentEntity selected = new StrategicInstrumentEntity();
    public StrategicInstrumentBean(IStrategicInstrumentService service) { this.service = service; }
    public List<StrategicInstrumentEntity> getItems() { return service.findAll(); }
    public StrategicInstrumentEntity getSelected() { return selected; }
    public void setSelected(StrategicInstrumentEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new StrategicInstrumentEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
