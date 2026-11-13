package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.InterventionTypeEntity;
import mz.co.biodiversity.service.IInterventionTypeService;
@Component
@Scope("view")
public class InterventionTypeBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IInterventionTypeService service;
    private InterventionTypeEntity selected = new InterventionTypeEntity();
    public InterventionTypeBean(IInterventionTypeService service) { this.service = service; }
    public List<InterventionTypeEntity> getItems() { return service.findAll(); }
    public InterventionTypeEntity getSelected() { return selected; }
    public void setSelected(InterventionTypeEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new InterventionTypeEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
