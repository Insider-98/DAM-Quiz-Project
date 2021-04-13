package Logica;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class PreguntaMatematicasLogica extends Pregunta{
	//Creamos els atributs de la clase
	private String idMatematicas;
	protected String operacio;
	
	public void operacionMatematicasCalculable(String operacion) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("javascript");
		Object result = engine.eval(operacion);
		int valor = Integer.decode(result.toString());
		System.out.println(valor);
	}

	@Override
	void cogerPregunta() {
		// Creado por Iv�n Guirola
		
	}
}
