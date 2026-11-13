package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ActionBiodiversityTaggingEntity;
import mz.co.biodiversity.service.IActionBiodiversityTaggingService;
@Component
@Scope("view")
public class ActionBiodiversityTaggingBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IActionBiodiversityTaggingService service;
    private ActionBiodiversityTaggingEntity selected = new ActionBiodiversityTaggingEntity();
    public ActionBiodiversityTaggingBean(IActionBiodiversityTaggingService service) { this.service = service; }
    public List<ActionBiodiversityTaggingEntity> getItems() { return service.findAll(); }
    public ActionBiodiversityTaggingEntity getSelected() { return selected; }
    public void setSelected(ActionBiodiversityTaggingEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ActionBiodiversityTaggingEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
