import com.lagou.config.ConditionalConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 18:20
 **/
public class TestConditional {

	@Test
	public void testConditional(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
		String[] names = context.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
