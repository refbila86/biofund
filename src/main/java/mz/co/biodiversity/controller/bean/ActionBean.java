package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ActionEntity;
import mz.co.biodiversity.service.IActionService;
@Component
@Scope("view")
public class ActionBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IActionService service;
    private ActionEntity selected = new ActionEntity();
    public ActionBean(IActionService service) { this.service = service; }
    public List<ActionEntity> getItems() { return service.findAll(); }
    public ActionEntity getSelected() { return selected; }
    public void setSelected(ActionEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ActionEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
