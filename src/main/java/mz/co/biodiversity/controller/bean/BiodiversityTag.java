package mz.co.biodiversity.controller.bean;

import java.io.Serializable;

/**
 * Marcação de biodiversidade de um projecto, acção ou rubrica orçamental. Por
 * agora é um objecto simples em memória; quando existir a entidade JPA,
 * substitua-o por ela.
 */
public class BiodiversityTag implements Serializable
{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String code;
	private String itemType = "Projecto";
	private String itemName;
	private String institution;
	private String relevance = "Significativa";
	private String nbsapObjective;
	private int weight = 40;
	private String notes;

	public BiodiversityTag copy()
	{
		BiodiversityTag t = new BiodiversityTag();
		t.id = id;
		t.code = code;
		t.itemType = itemType;
		t.itemName = itemName;
		t.institution = institution;
		t.relevance = relevance;
		t.nbsapObjective = nbsapObjective;
		t.weight = weight;
		t.notes = notes;
		return t;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getItemType()
	{
		return itemType;
	}

	public void setItemType(String itemType)
	{
		this.itemType = itemType;
	}

	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public String getInstitution()
	{
		return institution;
	}

	public void setInstitution(String institution)
	{
		this.institution = institution;
	}

	public String getRelevance()
	{
		return relevance;
	}

	public void setRelevance(String relevance)
	{
		this.relevance = relevance;
	}

	public String getNbsapObjective()
	{
		return nbsapObjective;
	}

	public void setNbsapObjective(String nbsapObjective)
	{
		this.nbsapObjective = nbsapObjective;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	public String getNotes()
	{
		return notes;
	}

	public void setNotes(String notes)
	{
		this.notes = notes;
	}
}