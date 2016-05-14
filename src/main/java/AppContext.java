import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.liushan.service.MessageService;

/**
 * Created by liushan03 on 16/5/13.
 */
@Configuration
public class AppContext {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {

            public String getMessage() {
                return "Hello World!";
            }
        };
    }

}
