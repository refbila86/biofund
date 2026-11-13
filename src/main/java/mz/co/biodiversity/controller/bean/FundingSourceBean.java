package mz.co.biodiversity.controller.bean;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import mz.co.biodiversity.model.entity.FundingSourceEntity;
import mz.co.biodiversity.service.IFundingSourceService;
@Component
@Scope("view")
public class FundingSourceBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private final IFundingSourceService service;
    private FundingSourceEntity selected = new FundingSourceEntity();
    public FundingSourceBean(IFundingSourceService service) { this.service = service; }
    public List<FundingSourceEntity> getItems() { return service.findAll(); }
    public FundingSourceEntity getSelected() { return selected; }
    public void setSelected(FundingSourceEntity selected) { this.selected = selected; }
    public void prepareNew() { selected = new FundingSourceEntity(); }
    public void save() { selected = service.save(selected); }
    public void delete(Long id) { service.deleteById(id); }
}
