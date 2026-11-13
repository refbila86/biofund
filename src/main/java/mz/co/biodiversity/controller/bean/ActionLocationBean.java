package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ActionLocationEntity;
import mz.co.biodiversity.service.IActionLocationService;
@Component
@Scope("view")
public class ActionLocationBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IActionLocationService service;
    private ActionLocationEntity selected = new ActionLocationEntity();
    public ActionLocationBean(IActionLocationService service) { this.service = service; }
    public List<ActionLocationEntity> getItems() { return service.findAll(); }
    public ActionLocationEntity getSelected() { return selected; }
    public void setSelected(ActionLocationEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ActionLocationEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
