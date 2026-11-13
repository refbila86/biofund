package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.TargetEntity;
import mz.co.biodiversity.service.ITargetService;
@Component
@Scope("view")
public class TargetBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final ITargetService service;
    private TargetEntity selected = new TargetEntity();
    public TargetBean(ITargetService service) { this.service = service; }
    public List<TargetEntity> getItems() { return service.findAll(); }
    public TargetEntity getSelected() { return selected; }
    public void setSelected(TargetEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new TargetEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
