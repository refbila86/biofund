package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.DataSourceEntity;
import mz.co.biodiversity.service.IDataSourceService;
@Component
@Scope("view")
public class DataSourceBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IDataSourceService service;
    private DataSourceEntity selected = new DataSourceEntity();
    public DataSourceBean(IDataSourceService service) { this.service = service; }
    public List<DataSourceEntity> getItems() { return service.findAll(); }
    public DataSourceEntity getSelected() { return selected; }
    public void setSelected(DataSourceEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new DataSourceEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
