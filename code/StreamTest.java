import java.util.*;
import java.io.*;

public class StreamTest {
	ArrayList<String> vogais = new ArrayList<String>();
	ArrayList<String> consoantesRepetidas = new ArrayList<String>();
	ArrayList<String> resultados = new ArrayList<String>();
	String ultimaConsoante = "";
	

	public String firstChar(Stream teste) {
		vogais.add("a");vogais.add("e");vogais.add("i");vogais.add("o");vogais.add("u");
		vogais.add("A");vogais.add("E");vogais.add("I");vogais.add("O");vogais.add("U");
		String testString = tesString theString = IOUtils.toString(teste.getInputStream(), "UTF-8"); 

		for(int f=0; f<testString.length();f++) {
			// pego o caracter da vez
			String charAtual = String.valueOf(testString.charAt(f));
			
			//vejo se ele é uma vogal
			if(vogais.contains(charAtual)) {
				String charAnterior = (f>=1?String.valueOf(testString.charAt(f-1)):"");
				System.out.println("e vogal "+charAtual);
				// vejo se o cacter em questão tem uma consoante antes dele
				if(!vogais.contains(charAnterior)) {
					// verifico se existe uma repetição desta consoante
					System.out.println("e consoante a anterior "+charAnterior);
					if(!consoantesRepetidas.contains(charAnterior)) {
						System.out.println("consoante não repete "+charAnterior);
						String resultado = (f>=2?String.valueOf(testString.charAt(f-2)):"");
						if(!resultado.equals(charAtual)) {
							System.out.println("Resultado Encontrado: " + charAtual);
							resultados.add(charAtual);
						}
					}
				}
			} else {
				if(ultimaConsoante.toUpperCase().equals(charAtual.toUpperCase())) {
					consoantesRepetidas.add(charAtual);
				}
				ultimaConsoante = charAtual;
			}
		}
		return resultados.get[0];
	}

	public boolean hasNext() {
		return this.resultados.hasNext();
	}

	public String next() {
		return this.resultados.next();
	}

}
