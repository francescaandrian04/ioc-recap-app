package pixel.academy.spring_core_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    private Chef myChef;

    // constructor
    @Autowired
    public DemoController(Chef theChef) {
        myChef = theChef;
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe2() {
        return myChef.getDailyRecipe2();
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe3() {
        return myChef.getDailyRecipe3();
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe4() {
        return myChef.getDailyRecipe4();
    }


}
