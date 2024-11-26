package org.projetos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ChatbotTest {

    @Test
    void deveInterpretarComandoLigarLuz() {
        Chatbot chatbot = new Chatbot();
        assertEquals("Luz ligada!", chatbot.interpretar("ligar luz"));
    }

    @Test
    void deveInterpretarComandoDesligarLuz() {
        Chatbot chatbot = new Chatbot();
        assertEquals("Luz desligada!", chatbot.interpretar("desligar luz"));
    }

    @Test
    void deveInterpretarComandoAumentarVolume() {
        Chatbot chatbot = new Chatbot();
        assertEquals("Volume aumentado!", chatbot.interpretar("aumentar volume"));
    }

    @Test
    void deveInterpretarComandoDiminuirVolume() {
        Chatbot chatbot = new Chatbot();
        assertEquals("Volume diminuído!", chatbot.interpretar("diminuir volume"));
    }

    @Test
    void deveInterpretarComandoMostrarTemperatura() {
        Chatbot chatbot = new Chatbot();
        assertEquals("A temperatura atual é 22°C.", chatbot.interpretar("mostrar temperatura"));
    }

    @Test
    void deveRetornarExcecaoParaComandoInvalido() {
        Chatbot chatbot = new Chatbot();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            chatbot.interpretar("comando inválido");
        });
        assertEquals("Comando inválido", exception.getMessage());
    }
}