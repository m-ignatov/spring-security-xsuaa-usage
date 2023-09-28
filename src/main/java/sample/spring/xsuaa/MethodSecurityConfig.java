package sample.spring.xsuaa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.context.SecurityContextHolder;

@Configuration
@EnableMethodSecurity
public class MethodSecurityConfig {

  @Bean
  static MethodSecurityExpressionHandler methodSecurityExpressionHandler() {
    SecurityContextHolder.setStrategyName(SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
    return new DefaultMethodSecurityExpressionHandler();
  }
}
