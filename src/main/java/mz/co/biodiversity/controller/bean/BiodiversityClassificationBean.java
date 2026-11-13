package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.BiodiversityClassificationEntity;
import mz.co.biodiversity.service.IBiodiversityClassificationService;
@Component
@Scope("view")
public class BiodiversityClassificationBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IBiodiversityClassificationService service;
    private BiodiversityClassificationEntity selected = new BiodiversityClassificationEntity();
    public BiodiversityClassificationBean(IBiodiversityClassificationService service) { this.service = service; }
    public List<BiodiversityClassificationEntity> getItems() { return service.findAll(); }
    public BiodiversityClassificationEntity getSelected() { return selected; }
    public void setSelected(BiodiversityClassificationEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new BiodiversityClassificationEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
