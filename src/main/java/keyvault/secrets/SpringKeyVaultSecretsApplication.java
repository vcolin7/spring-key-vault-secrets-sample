package keyvault.secrets;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKeyVaultSecretsApplication implements CommandLineRunner {
    @Value("${mySecret1}")
    private String mySecret1;
    @Value("${mySecret2}")
    private String mySecret2;

    public static void main(String[] args) {
        SpringApplication.run(SpringKeyVaultSecretsApplication.class, args);
    }

    public void run(String[] args) {
        System.out.println("mySecret1: " + mySecret1);
        System.out.println("mySecret2: " + mySecret2);
    }
}
