package org.projetos;

import java.util.HashMap;
import java.util.Map;

public class Chatbot {
    private static final Map<String, InterpretadorExpressao> comandos = new HashMap<>();

    static {
        comandos.put("ligar luz", new LigarLuz());
        comandos.put("desligar luz", new DesligarLuz());
        comandos.put("aumentar volume", new AumentarVolume());
        comandos.put("diminuir volume", new DiminuirVolume());
        comandos.put("mostrar temperatura", new MostrarTemperatura());
    }

    public String interpretar(String comando) {
        InterpretadorExpressao interpretador = comandos.get(comando.toLowerCase());
        if (interpretador != null) {
            return interpretador.interpretar();
        }
        throw new IllegalArgumentException("Comando inválido");
    }
}
    