package com.elo7.techtalk;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.elo7.techtalk.model.Fato;
import com.elo7.techtalk.model.Resultado;

public class BackwardChaining {

	public static void main(String[] args) {
		// load up the knowledge base
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules-backward");
		
		Resultado resultado = new Resultado();
		kSession.setGlobal("resultado", resultado);
		kSession.insert(new Fato("Ásia", "Planeta Terra"));
		kSession.insert(new Fato("China", "Ásia"));
		kSession.insert(new Fato("Grande Muralha da China", "China"));
 
		kSession.fireAllRules();
		
		System.out.println(resultado.getValor());
	}
	
}
