package mack.servicos;

import java.util.ArrayList;
import java.util.List;

//generics
public class ServicoImpressao<T> {

	List<T> fila = new ArrayList<>();

	public void insereElemento(T valor) {
		fila.add(valor);
	}

	public T primeiroDaFila() {
		if (fila.isEmpty()) {
			System.err.println("FILA VAZIA");
			return null;
		}
		return fila.get(0);
	}

	public void imprime() {
		System.out.print("[");

		if (!fila.isEmpty()) {
			System.out.print(fila.get(0));
		}

		for (int i = 1; i < fila.size(); i++) {
			System.out.print(", " + fila.get(i));
		}

		System.out.println("]");
	}
}
