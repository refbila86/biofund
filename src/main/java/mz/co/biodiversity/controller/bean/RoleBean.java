package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.RoleEntity;
import mz.co.biodiversity.service.IRoleService;
@Component
@Scope("view")
public class RoleBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IRoleService service;
    private RoleEntity selected = new RoleEntity();
    public RoleBean(IRoleService service) { this.service = service; }
    public List<RoleEntity> getItems() { return service.findAll(); }
    public RoleEntity getSelected() { return selected; }
    public void setSelected(RoleEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new RoleEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
