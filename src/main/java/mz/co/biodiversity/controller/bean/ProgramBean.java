package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ProgramEntity;
import mz.co.biodiversity.service.IProgramService;
@Component
@Scope("view")
public class ProgramBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IProgramService service;
    private ProgramEntity selected = new ProgramEntity();
    public ProgramBean(IProgramService service) { this.service = service; }
    public List<ProgramEntity> getItems() { return service.findAll(); }
    public ProgramEntity getSelected() { return selected; }
    public void setSelected(ProgramEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ProgramEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
