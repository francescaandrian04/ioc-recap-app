package pixel.academy.spring_core_ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(          // butonul de start al aplicatiei
		scanBasePackages = {"pixel.academy.spring_core_ioc, util"}
)
public class SpringCoreIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreIocApplication.class, args);
	}

}
