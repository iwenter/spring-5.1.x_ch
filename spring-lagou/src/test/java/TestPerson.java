import com.lagou.config.PersonConfig;
import com.lagou.edu.Person;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 14:51
 **/
public class TestPerson {

	@Test
	public void testXML(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person = (Person)context.getBean("person");

		System.out.println(person);

		context.close();
	}

	@Test
	public void testAnnotation(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person person = (Person) applicationContext.getBean("person");

		System.out.println(person);

		applicationContext.close();
	}
}
