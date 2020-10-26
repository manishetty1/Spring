package config;


import com.example.helloworld.BasketBallCoach;
import com.example.helloworld.FortuneService;
import com.example.helloworld.HappyFortuneServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration
{
    //create a bean of happyfortune service as to inject this to the basketballcoach constructor.
    //the method name is the beanID
    @Bean
    public FortuneService happyFortuneService()
    {
        return new HappyFortuneServiceImpl();
    }

    @Bean
    public BasketBallCoach basketBallCoach()
    {
        return new BasketBallCoach(happyFortuneService());
    }

}
