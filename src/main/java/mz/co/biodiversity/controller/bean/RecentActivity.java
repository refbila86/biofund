package mz.co.biodiversity.controller.bean;

import java.io.Serializable;

/**
 * Linha da tabela "Recent Activities" do dashboard.
 * Os nomes dos campos (title, institution, date, status) são os que o dashboard.xhtml usa.
 */
public class RecentActivity implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String title;
	private final String institution;
	private final String date;
	private final String status;

	public RecentActivity(String title, String institution, String date, String status) {
		this.title = title;
		this.institution = institution;
		this.date = date;
		this.status = status;
	}

	public String getTitle() { return title; }
	public String getInstitution() { return institution; }
	public String getDate() { return date; }
	public String getStatus() { return status; }
}
