package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ProjectEntity;
import mz.co.biodiversity.service.IProjectService;
@Component
@Scope("view")
public class ProjectBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IProjectService service;
    private ProjectEntity selected = new ProjectEntity();
    public ProjectBean(IProjectService service) { this.service = service; }
    public List<ProjectEntity> getItems() { return service.findAll(); }
    public ProjectEntity getSelected() { return selected; }
    public void setSelected(ProjectEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ProjectEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
