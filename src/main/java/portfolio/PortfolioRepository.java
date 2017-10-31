package portfolio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class PortfolioRepository {

	protected Map<Long, Portfolio> projects = new HashMap<Long, Portfolio>();

	public PortfolioRepository() {
		Portfolio project1 = new Portfolio(1L, "Tribute Page", "/images/tributepage.jpg", "Web Pages",
				"My first web page");
		Portfolio project2 = new Portfolio(2L, "Virtual Pets", "/images/virtualpet.jpg", "Projects",
				"My first project");
		Portfolio project3 = new Portfolio(3L, "Reviews Page", "/images/reviewpage.jpg", "Web Pages",
				"My first WCCI web page");
		Portfolio project4 = new Portfolio(4L, "Coming Soon", "/images/comingsoon.jpg", "Web Pages",
				"New Pages Coming");

		projects.put(project1.getId(), project1);
		projects.put(project2.getId(), project2);
		projects.put(project3.getId(), project3);
		projects.put(project4.getId(), project4);
	}

	public Collection<Portfolio> findAll() {
		return projects.values();
	}

	public Portfolio findOne(long id) {
		return projects.get(id);
	}

}
