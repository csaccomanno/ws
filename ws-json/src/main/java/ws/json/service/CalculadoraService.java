package ws.json.service;

import ws.json.model.Valor;
import ws.json.model.Resultado;

public interface CalculadoraService {

	 public Resultado suma(Valor valor1, Valor valor2);
	 public Resultado resta(Valor operacion);
	 public Resultado multiplicacion(Valor operacion);
	 public Resultado division(Valor operacion);
}
