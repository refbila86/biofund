package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.InstitutionEntity;
import mz.co.biodiversity.service.IInstitutionService;
@Component
@Scope("view")
public class InstitutionBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IInstitutionService service;
    private InstitutionEntity selected = new InstitutionEntity();
    public InstitutionBean(IInstitutionService service) { this.service = service; }
    public List<InstitutionEntity> getItems() { return service.findAll(); }
    public InstitutionEntity getSelected() { return selected; }
    public void setSelected(InstitutionEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new InstitutionEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
