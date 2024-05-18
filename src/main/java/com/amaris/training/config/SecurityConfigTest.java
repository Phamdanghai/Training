//package com.amaris.training.config;
//
//import com.amaris.training.exception.NotFoundException;
//import com.amaris.training.repository.AccountRepository;
//import com.amaris.training.security.jwt.JwtTokenFilter;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import javax.servlet.http.HttpServletResponse;
//
//@Configurable
//@EnableWebSecurity
//public class SecurityConfigTest extends WebSecurityConfigurerAdapter {
//    final AccountRepository accountRepository;
//
//    final JwtTokenFilter tokenFilter;
//
//    public SecurityConfigTest(AccountRepository accountRepository, JwtTokenFilter tokenFilter) {
//        this.accountRepository = accountRepository;
//        this.tokenFilter = tokenFilter;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(username -> accountRepository.findByEmail(username)
//                .orElseThrow(
//                        () -> new NotFoundException("Email" +username+"Not found")
//                ));
//    }
//
//    @Override
//    @Bean
//    protected AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        http.exceptionHandling().authenticationEntryPoint(
//                (request, response, authException) -> {
//                    response.sendError(HttpServletResponse.SC_UNAUTHORIZED,
//                    authException.getMessage());
//                }
//        );
//        http.authorizeRequests()
//                .antMatchers("/auth",
//                        "/swagger-ui/index.html",
//                        "/v2/api-docs/**",
//                        "/v3/api-docs/**",
//                        "/v3/api-docs",
//                        "/swagger-ui**",
//                        "/swagger-ui.html","/accounts")
//                .permitAll()
//                .anyRequest().authenticated();
//
//        http.addFilterBefore(tokenFilter, UsernamePasswordAuthenticationFilter.class);
//    }
//}
