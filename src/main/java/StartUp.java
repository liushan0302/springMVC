import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.liushan.service.MessageService;

/**
 * Created by liushan03 on 16/4/6.
 */
@Configuration
//@EnableAutoConfiguration
@ComponentScan
public class StartUp {

    private static Logger logger = LoggerFactory.getLogger(StartUp.class);

//    public static void main(String[] args) {
//        System.out.print("hello");
//        SpringApplication.run(AppContext.class, args);
//    }
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppContext.class);
        MessageService service = context.getBean(MessageService.class);
        System.out.print(service.getMessage());
    }

}
