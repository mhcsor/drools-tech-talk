package com.elo7.techtalk;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.elo7.techtalk.model.Caracteristicas;
import com.elo7.techtalk.model.Caracteristicas.Cor;
import com.elo7.techtalk.model.Caracteristicas.Forma;
import com.elo7.techtalk.model.Caracteristicas.Sabor;
import com.elo7.techtalk.model.Caracteristicas.Tamanho;

public class ForwardChaining {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			// go !
			kSession.insert(new Caracteristicas(Cor.VERMELHA, Sabor.DOCE, Tamanho.MEDIO, Forma.ARREDONDADA));
			kSession.insert(new Caracteristicas(Cor.AMARELA, Sabor.DOCE, Tamanho.MEDIO, Forma.ALONGADA));
			kSession.insert(new Caracteristicas(Cor.VERDE, Sabor.DOCE, Tamanho.GRANDE, Forma.ARREDONDADA));
			kSession.insert(new Caracteristicas(Cor.VERMELHA, Sabor.DOCE, Tamanho.PEQUENO, Forma.ARREDONDADA));
			kSession.insert(new Caracteristicas(Cor.AMARELA, Sabor.CITRICO, Tamanho.MEDIO, Forma.ARREDONDADA));
			kSession.insert(new Caracteristicas(Cor.AMARELA, Sabor.CITRICO, Tamanho.PEQUENO, Forma.ARREDONDADA));

			kSession.fireAllRules();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
