package mz.co.biodiversity.controller.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

/**
 * Backing bean de /pages/biodiversity/tagging.xhtml (EL name: taggingBean).
 *
 * Os dados ficam em memória (session scope) e começam com alguns exemplos.
 * TODO: ligar a um serviço/repositório JPA para gravar na base de dados.
 */
@Component("taggingBean")
@SessionScope
public class TaggingBean implements Serializable
{

	private static final long serialVersionUID = 1L;

	private final List<BiodiversityTag> tags = new ArrayList<>();
	private BiodiversityTag selected = new BiodiversityTag();
	private long nextId = 1;

	public TaggingBean()
	{
		// Exemplos para a página aparecer preenchida. Apague quando houver dados reais.
		seed("Projecto", "Conservação de mangais da Baía de Maputo", "MITADER", "Principal", "Objectivo NBSAP 1", 100);
		seed("Acção", "Formação de fiscais comunitários", "ANAC", "Significativa", "Objectivo NBSAP 3", 40);
		seed("Rubrica orçamental", "Monitoria do Parque Nacional do Limpopo", "ANAC", "Principal", "Objectivo NBSAP 2", 100);
		seed("Projecto", "Estrada Costeira Sul", "ANE", "Não relevante", "Objectivo NBSAP 4", 0);
	}

	private void seed(String type, String name, String institution, String relevance, String objective, int weight)
	{
		BiodiversityTag t = new BiodiversityTag();
		t.setItemType(type);
		t.setItemName(name);
		t.setInstitution(institution);
		t.setRelevance(relevance);
		t.setNbsapObjective(objective);
		t.setWeight(weight);
		t.setId(nextId);
		t.setCode(String.format("TAG-%03d", nextId));
		nextId++;
		tags.add(t);
	}

	// ---- Acções ----

	public void prepareNew()
	{
		selected = new BiodiversityTag();
	}

	/** Chamado pelo botão Guardar. */
	public void save()
	{
		if (selected.getId() == null)
		{
			selected.setId(nextId);
			selected.setCode(String.format("TAG-%03d", nextId));
			nextId++;
			tags.add(0, selected);
			info("Marcação criada", selected.getCode());
		} else
		{
			for (int i = 0; i < tags.size(); i++)
			{
				if (tags.get(i).getId().equals(selected.getId()))
				{
					tags.set(i, selected);
					break;
				}
			}
			info("Marcação actualizada", selected.getCode());
		}
		selected = new BiodiversityTag();
	}

	public void delete(Long id)
	{
		tags.removeIf(t -> t.getId().equals(id));
		info("Marcação eliminada", "");
	}

	private void info(String summary, String detail)
	{
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail));
	}

	// ---- Listas para os selects ----

	public List<String> getItemTypes()
	{
		return List.of("Projecto", "Acção", "Rubrica orçamental");
	}

	public List<String> getRelevanceOptions()
	{
		return List.of("Principal", "Significativa", "Não relevante");
	}

	public List<String> getNbsapObjectives()
	{
		// TODO: carregar da tabela de objectivos NBSAP
		return List.of("Objectivo NBSAP 1", "Objectivo NBSAP 2", "Objectivo NBSAP 3", "Objectivo NBSAP 4", "Objectivo NBSAP 5");
	}

	// ---- Getters / setters ----

	public List<BiodiversityTag> getTags()
	{
		return tags;
	}

	public BiodiversityTag getSelected()
	{
		return selected;
	}

	public void setSelected(BiodiversityTag selected)
	{
		// Trabalhar sobre uma cópia: Cancelar não altera a linha da tabela
		this.selected = selected == null ? new BiodiversityTag() : selected.copy();
	}
}