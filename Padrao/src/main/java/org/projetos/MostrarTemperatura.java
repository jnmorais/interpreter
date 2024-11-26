package org.projetos;

public class MostrarTemperatura implements InterpretadorExpressao {
    @Override
    public String interpretar() {
        return "A temperatura atual é 22°C.";
    }
}
