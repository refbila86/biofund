package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ActionIndicatorEntity;
import mz.co.biodiversity.service.IActionIndicatorService;
@Component
@Scope("view")
public class ActionIndicatorBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IActionIndicatorService service;
    private ActionIndicatorEntity selected = new ActionIndicatorEntity();
    public ActionIndicatorBean(IActionIndicatorService service) { this.service = service; }
    public List<ActionIndicatorEntity> getItems() { return service.findAll(); }
    public ActionIndicatorEntity getSelected() { return selected; }
    public void setSelected(ActionIndicatorEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ActionIndicatorEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
