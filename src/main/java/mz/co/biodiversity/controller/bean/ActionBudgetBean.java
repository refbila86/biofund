package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ActionBudgetEntity;
import mz.co.biodiversity.service.IActionBudgetService;
@Component
@Scope("view")
public class ActionBudgetBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IActionBudgetService service;
    private ActionBudgetEntity selected = new ActionBudgetEntity();
    public ActionBudgetBean(IActionBudgetService service) { this.service = service; }
    public List<ActionBudgetEntity> getItems() { return service.findAll(); }
    public ActionBudgetEntity getSelected() { return selected; }
    public void setSelected(ActionBudgetEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ActionBudgetEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
