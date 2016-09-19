package fi.antti.spring.controller;

import java.util.List;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.antti.spring.bean.Paino;
import fi.antti.spring.dao.PainoDAO;


@Controller
@RequestMapping("/")
public class PainoController {
	//En saa injectionilla toimii. T‰ll‰ toimii.
	private final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	private final PainoDAO db = (PainoDAO)context.getBean("painoLuokka");
	final static Logger logger = LoggerFactory.getLogger(Controller.class);
		
	/*
	@Inject
	private PainoDAO dao;
	
	public PainoDAO getDao() {
		return dao;
	}

	public void setDao(PainoDAO dao) {
		this.dao = dao;
	}
	*/
	
	@RequestMapping(method = RequestMethod.GET)
	public String etusivu(ModelMap model) {
		
		return "index";
	}

	@RequestMapping(value = "/paino", method = RequestMethod.GET)
	public String naytaKaikki(Model model) {
		List<Paino> painot = db.haeKaikki();
		model.addAttribute("painot", painot);
		logger.info("Haettu kaikki painot tietokannasta");
		
		Paino placeHolder = new Paino();
		placeHolder.setPaino(0);		
		model.addAttribute("paino", placeHolder);
		logger.info("Laitettu placeholder arvo formille");
	
		return "painot";
	}

	
	@RequestMapping(value="paino", method=RequestMethod.POST)
	public String create( @ModelAttribute(value="paino") Paino paino) {
		db.talleta(paino);
		logger.info("Lis‰‰ uusi paino nappia on painettu. Tuupataan tietokantaan");
		return "redirect:/paino";
	}
	
	

}
