package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.FocalPointEntity;
import mz.co.biodiversity.service.IFocalPointService;
@Component
@Scope("view")
public class FocalPointBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IFocalPointService service;
    private FocalPointEntity selected = new FocalPointEntity();
    public FocalPointBean(IFocalPointService service) { this.service = service; }
    public List<FocalPointEntity> getItems() { return service.findAll(); }
    public FocalPointEntity getSelected() { return selected; }
    public void setSelected(FocalPointEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new FocalPointEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
