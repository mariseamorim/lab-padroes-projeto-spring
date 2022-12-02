package one.digitalinnovation.gof;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author falvojr
 */
@EnableFeignClients
@SpringBootApplication

@OpenAPIDefinition(
        info = @Info(title = "Api de Crud", version = "1.0", description = "API do  Projeto Prático Padrões de Projetos com Spring"),
        servers = {
                @Server(url = "http://localhost:8080")

        }
)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}