package CategoriaSeguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter{
		@Autowired
		private ImplementsUserDetailsService userDetailsService;
		
		@Override
		protected void configure(HttpSecurity http) throws Exception{
			http.csrf().disable().authorizeRequests()
			.antMatchers(HttpMethod.GET, "/").permitAll()
			.antMatchers(HttpMethod.POST, "/cadastrar").permitAll()
			
			.antMatchers(HttpMethod.GET, "/cadastrarTema").hasRole("ADMIN")
			.antMatchers(HttpMethod.POST, "/cadastrarTema").hasRole("ADMIN")
			.antMatchers(HttpMethod.GET, "/formTema").permitAll()
			.antMatchers(HttpMethod.POST, "/formTema").hasRole("ADMIN")
			.anyRequest().authenticated()
			.and().formLogin().permitAll()
			.and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
		}
// Security autenticar o usuario e senha		
// Toda senha que digita ele vai verificar se realmente é verdadeira, por isso ele vai autenticar com criptografia, mas ele vai converter desecriptografar
// O sistema vai encriptar tanto a que esta salvando quando a Digitada, e ai vai comparar e autenticar
@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	auth.userDetailsService(userDetailsService)
	.passwordEncoder(new BCryptPasswordEncoder());
}
}
