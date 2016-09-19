package fi.antti.spring.batch;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fi.antti.spring.bean.Paino;
import fi.antti.spring.dao.PainoDAO;

public class PainoHandler {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		PainoDAO db = (PainoDAO)context.getBean("painoLuokka");
		
		Paino addNew = new Paino();
		addNew.setPaino(66);
		db.talleta(addNew);
		List<Paino> paino = db.haeKaikki();
		for (Paino p : paino) {
			System.out.println(p.toString());
		}
		// TODO Auto-generated method stub
		
		
		


	}

}
