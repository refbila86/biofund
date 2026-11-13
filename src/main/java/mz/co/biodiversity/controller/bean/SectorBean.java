package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.SectorEntity;
import mz.co.biodiversity.service.ISectorService;
@Component
@Scope("view")
public class SectorBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final ISectorService service;
    private SectorEntity selected = new SectorEntity();
    public SectorBean(ISectorService service) { this.service = service; }
    public List<SectorEntity> getItems() { return service.findAll(); }
    public SectorEntity getSelected() { return selected; }
    public void setSelected(SectorEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new SectorEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
