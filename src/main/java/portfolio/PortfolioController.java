package portfolio;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PortfolioController {
	@Resource
	PortfolioRepository repository = new PortfolioRepository();

	@RequestMapping("/projects")
	public String getAllProjects(Model model) {
		model.addAttribute("projects", repository.findAll());
		return "projects";
	}

	@RequestMapping("/project")
	public String getOneProjects(@RequestParam(value = "id") long id, Model model) {
		model.addAttribute("projects", repository.findOne(id));
		return "project";
	}

}
