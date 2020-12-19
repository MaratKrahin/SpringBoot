package maratK.SpringBoot.config;

import maratK.SpringBoot.systemProfile.DevProfile;
import maratK.SpringBoot.systemProfile.ProductionProfile;
import maratK.SpringBoot.systemProfile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    public SystemProfile developmentProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    public SystemProfile productionProfile() {
        return new ProductionProfile();
    }
}
