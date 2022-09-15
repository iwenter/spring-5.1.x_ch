import com.lagou.config.StudentConfig;
import com.lagou.edu.Student;
import com.lagou.edu.StudentService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 15:30
 **/
public class TestStudent {


	@Test
	public void testConfig(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
//		Student student1 = (Student) context.getBean("student");
//		Student student2 = (Student) context.getBean("student");
//		System.out.println(student1);
//		System.out.println(student2);

		context.close();
	}

	@Test
	public void testScan(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.lagou.edu.Test.class);
		StudentService bean = (StudentService) context.getBean("studentService");

		System.out.println(bean);

		context.close();
	}
}
