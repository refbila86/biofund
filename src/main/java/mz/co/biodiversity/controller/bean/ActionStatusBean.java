package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ActionStatusEntity;
import mz.co.biodiversity.service.IActionStatusService;
@Component
@Scope("view")
public class ActionStatusBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IActionStatusService service;
    private ActionStatusEntity selected = new ActionStatusEntity();
    public ActionStatusBean(IActionStatusService service) { this.service = service; }
    public List<ActionStatusEntity> getItems() { return service.findAll(); }
    public ActionStatusEntity getSelected() { return selected; }
    public void setSelected(ActionStatusEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ActionStatusEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
