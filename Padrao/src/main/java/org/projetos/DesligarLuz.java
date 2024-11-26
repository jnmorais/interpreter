package org.projetos;

public class DesligarLuz implements InterpretadorExpressao {
    @Override
    public String interpretar() {
        return "Luz desligada!";
    }
}

