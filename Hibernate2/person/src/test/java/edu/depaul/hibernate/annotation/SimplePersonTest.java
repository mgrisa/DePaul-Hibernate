package edu.depaul.hibernate.annotation;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import edu.depaul.hibernate.domain.annotation.Person;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class SimplePersonTest {

	@Autowired
	private SessionFactory sessionFactory;

	private String[] firstNames = {"Tom", "Richard", "Harry"};
	private String[] lastNames = {"Smith", "Johnson", "Williams"};
	private String initials = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private DecimalFormat formatter = new DecimalFormat("###-##-####");

	@DirtiesContext
	@Test
	@Transactional
	@SuppressWarnings("unchecked")
	public void test() {
		Session session = sessionFactory.getCurrentSession();

		session.save(buildPerson());
		session.save(buildPerson());
		session.save(buildPerson());

		List<Person> people = session.createQuery("from Person").list();

		System.err.println("********** P E O P L E ************");
		for (Person person : people) {
			System.out.println(person);
		}
	}

	private Person buildPerson() {
		Person result = new Person();

		Random randomGenerator = new Random();

		result.setBirthdate(new Date(randomGenerator.nextInt()));
		result.setFirstName(firstNames[randomGenerator.nextInt(2)]);
		result.setLastName(lastNames[randomGenerator.nextInt(2)]);
		result.setMiddleInitial(String.valueOf(initials.charAt(randomGenerator.nextInt(initials.length()))));
		result.setSsn(formatter.format(randomGenerator.nextInt(999999999)));

		return result;
	}
}
