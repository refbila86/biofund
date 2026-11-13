package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.ImportBatchEntity;
import mz.co.biodiversity.service.IImportBatchService;
@Component
@Scope("view")
public class ImportBatchBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IImportBatchService service;
    private ImportBatchEntity selected = new ImportBatchEntity();
    public ImportBatchBean(IImportBatchService service) { this.service = service; }
    public List<ImportBatchEntity> getItems() { return service.findAll(); }
    public ImportBatchEntity getSelected() { return selected; }
    public void setSelected(ImportBatchEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new ImportBatchEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
