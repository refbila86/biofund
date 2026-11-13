package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.IndicatorTargetPeriodEntity;
import mz.co.biodiversity.service.IIndicatorTargetPeriodService;
@Component
@Scope("view")
public class IndicatorTargetPeriodBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IIndicatorTargetPeriodService service;
    private IndicatorTargetPeriodEntity selected = new IndicatorTargetPeriodEntity();
    public IndicatorTargetPeriodBean(IIndicatorTargetPeriodService service) { this.service = service; }
    public List<IndicatorTargetPeriodEntity> getItems() { return service.findAll(); }
    public IndicatorTargetPeriodEntity getSelected() { return selected; }
    public void setSelected(IndicatorTargetPeriodEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new IndicatorTargetPeriodEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
