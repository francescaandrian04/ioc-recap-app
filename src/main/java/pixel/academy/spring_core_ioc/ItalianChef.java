package pixel.academy.spring_core_ioc;

import org.springframework.stereotype.Component;

@Component   // asa spun ca e obiect
public class ItalianChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pomodoro with fresh tomatoes and basil!";
    }

    @Override
    public String getDailyRecipe2() {
        return "Prepare pizza with tomatoes and mozzarella!";
    }

    @Override
    public String getDailyRecipe3() {
        return "Prepare ravioli!";
    }

    @Override
    public String getDailyRecipe4() {
        return "Prepare gnocchi alla nonna!";
    }

}
