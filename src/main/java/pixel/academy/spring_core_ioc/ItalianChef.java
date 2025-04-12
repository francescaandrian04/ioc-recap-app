package pixel.academy.spring_core_ioc;

import org.springframework.stereotype.Component;

@Component   // asa spun ca e obiect
public class ItalianChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pomodoro with fresh tomatoes and basil!";
    }

}
