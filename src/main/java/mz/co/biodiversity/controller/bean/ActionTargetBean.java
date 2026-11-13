package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ActionTargetEntity;
import mz.co.biodiversity.service.IActionTargetService;
@Component
@Scope("view")
public class ActionTargetBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IActionTargetService service;
    private ActionTargetEntity selected = new ActionTargetEntity();
    public ActionTargetBean(IActionTargetService service) { this.service = service; }
    public List<ActionTargetEntity> getItems() { return service.findAll(); }
    public ActionTargetEntity getSelected() { return selected; }
    public void setSelected(ActionTargetEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ActionTargetEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
