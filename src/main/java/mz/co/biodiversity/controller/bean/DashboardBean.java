package mz.co.biodiversity.controller.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import jakarta.annotation.PostConstruct;

/**
 * Backing bean do dashboard.xhtml (EL name: dashboardBean). Gerido pelo
 * Spring: @Component + @RequestScope. O ano escolhido viaja no pedido AJAX e os
 * dados são recarregados em cada pedido, por isso não ficam desactualizados.
 *
 * Neste momento usa DADOS DE EXEMPLO (DEMO_DATA = true) para o dashboard
 * aparecer preenchido. Quando tiver serviços/repositórios, injecte-os e
 * substitua os blocos marcados com TODO; depois ponha DEMO_DATA = false.
 */
@Component("dashboardBean")
@RequestScope
public class DashboardBean implements Serializable
{

	private static final long serialVersionUID = 1L;

	private static final boolean DEMO_DATA = true;

	// TODO: injectar os serviços reais, por exemplo:
	// @Autowired private InstitutionService institutionService;
	// @Autowired private ProjectService projectService;

	private int year = LocalDate.now().getYear();

	private long totalInstitutions;
	private long totalProjects;
	private long totalActions;
	private long totalIndicators;

	private BigDecimal budgetTotal = BigDecimal.ZERO;
	private BigDecimal executedTotal = BigDecimal.ZERO;
	private int executionRate;

	private String budgetChartModel;
	private String statusChartModel;

	private List<RecentActivity> recentActivities = new ArrayList<>();

	@PostConstruct
	public void init()
	{
		loadCounters();
		loadRecentActivities();
		loadYear();
	}

	/** Chamado pelo selector de ano (AJAX). */
	public void onYearChange()
	{
		loadYear();
	}

	private void loadCounters()
	{
		if (DEMO_DATA)
		{
			totalInstitutions = 18;
			totalProjects = 42;
			totalActions = 127;
			totalIndicators = 64;
			return;
		}
		// TODO: totalInstitutions = institutionService.count(); etc.
	}

	private void loadRecentActivities()
	{
		recentActivities = new ArrayList<>();
		if (DEMO_DATA)
		{
			recentActivities.add(new RecentActivity("Mapeamento de áreas de mangal", "MITADER", "10/11/2026", "Ongoing"));
			recentActivities.add(new RecentActivity("Revisão do plano de financiamento NBSAP", "BIOFUND", "08/11/2026", "Completed"));
			recentActivities.add(new RecentActivity("Formação de fiscais comunitários", "ANAC", "05/11/2026", "Ongoing"));
			recentActivities.add(new RecentActivity("Inventário de espécies marinhas", "IIP", "29/10/2026", "Planned"));
			recentActivities.add(new RecentActivity("Relatório semestral de execução", "MEF", "21/10/2026", "Completed"));
			recentActivities.add(new RecentActivity("Actualização de indicadores de biodiversidade", "UEM", "15/10/2026", "Delayed"));
			recentActivities.add(new RecentActivity("Monitoria do Parque Nacional do Limpopo", "ANAC", "02/10/2026", "Ongoing"));
			return;
		}
		// TODO: recentActivities = activityService.findRecent(20)
		// mapeando cada registo para new RecentActivity(titulo, instituicao, data,
		// estado)
	}

	private void loadYear()
	{
		// Valores por trimestre
		double[] planned =
		{ 0, 0, 0, 0 };
		double[] executed =
		{ 0, 0, 0, 0 };
		// Acções por estado
		long completed = 0, ongoing = 0, planning = 0, delayed = 0;

		if (DEMO_DATA)
		{
			int shift = LocalDate.now().getYear() - year; // varia um pouco por ano
			planned = new double[]
			{ 4_200_000, 5_100_000, 4_800_000, 6_000_000 };
			executed = new double[]
			{ 3_900_000 - shift * 300_000, 4_300_000 - shift * 250_000, 3_100_000 - shift * 200_000, 1_800_000 };
			completed = 58 - shift * 6L;
			ongoing = 41;
			planning = 20;
			delayed = 8;
		} else
		{
			// TODO: carregar orçamento planeado/executado por trimestre para 'year'
			// TODO: contar acções por estado para 'year'
		}

		double plannedSum = Arrays.stream(planned).sum();
		double executedSum = Arrays.stream(executed).sum();
		budgetTotal = BigDecimal.valueOf(plannedSum);
		executedTotal = BigDecimal.valueOf(executedSum);
		executionRate = plannedSum > 0 ? (int) Math.min(100, Math.round(executedSum * 100 / plannedSum)) : 0;

		// <p:chart value="..."> (PrimeFaces 14) recebe JSON do Chart.js
		budgetChartModel = """
				{"type":"bar",
				 "data":{"labels":["Q1","Q2","Q3","Q4"],
				   "datasets":[
				     {"label":"Planned","data":%s,"backgroundColor":"#a7d3b4","borderRadius":6},
				     {"label":"Executed","data":%s,"backgroundColor":"#15803d","borderRadius":6}]},
				 "options":{"maintainAspectRatio":false,
				   "plugins":{"legend":{"position":"bottom"}},
				   "scales":{"y":{"beginAtZero":true}}}}
				""".formatted(Arrays.toString(planned), Arrays.toString(executed));

		statusChartModel = """
				{"type":"doughnut",
				 "data":{"labels":["Completed","Ongoing","Planned","Delayed"],
				   "datasets":[{"data":[%d,%d,%d,%d],
				     "backgroundColor":["#15803d","#2d6a9f","#e8b13a","#b8452f"],
				     "borderWidth":2}]},
				 "options":{"maintainAspectRatio":false,"cutout":"62%%",
				   "plugins":{"legend":{"position":"bottom"}}}}
				""".formatted(completed, ongoing, planning, delayed);
	}

	public List<Integer> getAvailableYears()
	{
		int current = LocalDate.now().getYear();
		return List.of(current - 2, current - 1, current);
	}

	// ---- Getters / setters usados pelo dashboard.xhtml ----

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public long getTotalInstitutions()
	{
		return totalInstitutions;
	}

	public long getTotalProjects()
	{
		return totalProjects;
	}

	public long getTotalActions()
	{
		return totalActions;
	}

	public long getTotalIndicators()
	{
		return totalIndicators;
	}

	public BigDecimal getBudgetTotal()
	{
		return budgetTotal;
	}

	public BigDecimal getExecutedTotal()
	{
		return executedTotal;
	}

	public int getExecutionRate()
	{
		return executionRate;
	}

	public String getBudgetChartModel()
	{
		return budgetChartModel;
	}

	public String getStatusChartModel()
	{
		return statusChartModel;
	}

	public List<RecentActivity> getRecentActivities()
	{
		return recentActivities;
	}
}