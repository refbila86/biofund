package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.EvidenceEntity;
import mz.co.biodiversity.service.IEvidenceService;
@Component
@Scope("view")
public class EvidenceBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IEvidenceService service;
    private EvidenceEntity selected = new EvidenceEntity();
    public EvidenceBean(IEvidenceService service) { this.service = service; }
    public List<EvidenceEntity> getItems() { return service.findAll(); }
    public EvidenceEntity getSelected() { return selected; }
    public void setSelected(EvidenceEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new EvidenceEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
