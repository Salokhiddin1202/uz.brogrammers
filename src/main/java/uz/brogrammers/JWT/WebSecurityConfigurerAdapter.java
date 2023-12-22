package uz.brogrammers.JWT;

import org.springframework.security.config.annotation.SecurityBuilder;

public interface WebSecurityConfigurerAdapter {
    void init(SecurityBuilder builder) throws Exception;

    void configure(SecurityBuilder builder) throws Exception;
}
