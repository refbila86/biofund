package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ValidationStatusEntity;
import mz.co.biodiversity.service.IValidationStatusService;
@Component
@Scope("view")
public class ValidationStatusBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IValidationStatusService service;
    private ValidationStatusEntity selected = new ValidationStatusEntity();
    public ValidationStatusBean(IValidationStatusService service) { this.service = service; }
    public List<ValidationStatusEntity> getItems() { return service.findAll(); }
    public ValidationStatusEntity getSelected() { return selected; }
    public void setSelected(ValidationStatusEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ValidationStatusEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
