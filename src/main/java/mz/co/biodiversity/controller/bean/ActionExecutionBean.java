package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ActionExecutionEntity;
import mz.co.biodiversity.service.IActionExecutionService;
@Component
@Scope("view")
public class ActionExecutionBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IActionExecutionService service;
    private ActionExecutionEntity selected = new ActionExecutionEntity();
    public ActionExecutionBean(IActionExecutionService service) { this.service = service; }
    public List<ActionExecutionEntity> getItems() { return service.findAll(); }
    public ActionExecutionEntity getSelected() { return selected; }
    public void setSelected(ActionExecutionEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ActionExecutionEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
