package it.epicode.capstone.runner;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import it.epicode.auth.entity.User;
import it.epicode.capstone.service.UserService;
import it.epicode.capstone.service.UserService;

@Component
public class Runner implements ApplicationRunner {
	
	@Autowired UserService clienteServ;
	@Autowired @Qualifier("fake") ObjectProvider<User> userProvider;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		User c = userProvider.getObject();
		//clienteServ.salvaCliente(c);
		//System.out.println(c.getEmail());

	}

}
