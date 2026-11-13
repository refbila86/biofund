package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.AuditHistoryEntity;
import mz.co.biodiversity.service.IAuditHistoryService;
@Component
@Scope("view")
public class AuditHistoryBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IAuditHistoryService service;
    private AuditHistoryEntity selected = new AuditHistoryEntity();
    public AuditHistoryBean(IAuditHistoryService service) { this.service = service; }
    public List<AuditHistoryEntity> getItems() { return service.findAll(); }
    public AuditHistoryEntity getSelected() { return selected; }
    public void setSelected(AuditHistoryEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new AuditHistoryEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
