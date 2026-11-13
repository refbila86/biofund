package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.IndicatorEntity;
import mz.co.biodiversity.service.IIndicatorService;
@Component
@Scope("view")
public class IndicatorBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IIndicatorService service;
    private IndicatorEntity selected = new IndicatorEntity();
    public IndicatorBean(IIndicatorService service) { this.service = service; }
    public List<IndicatorEntity> getItems() { return service.findAll(); }
    public IndicatorEntity getSelected() { return selected; }
    public void setSelected(IndicatorEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new IndicatorEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
