package zerobibim.flory;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.TimeZone;

@EnableJpaAuditing
@SpringBootApplication
public class FloryApplication {

	@PostConstruct
	public void started() {
		// timezone UTC 셋팅
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.println("현재시각 : " + LocalDateTime.now());
	}
	public static void main(String[] args) {
		SpringApplication.run(FloryApplication.class, args);
	}

}
