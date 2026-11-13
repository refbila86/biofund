package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.IndicatorValueEntity;
import mz.co.biodiversity.service.IIndicatorValueService;
@Component
@Scope("view")
public class IndicatorValueBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IIndicatorValueService service;
    private IndicatorValueEntity selected = new IndicatorValueEntity();
    public IndicatorValueBean(IIndicatorValueService service) { this.service = service; }
    public List<IndicatorValueEntity> getItems() { return service.findAll(); }
    public IndicatorValueEntity getSelected() { return selected; }
    public void setSelected(IndicatorValueEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new IndicatorValueEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
