public class desafio5 {
    public static void main(String[] args) {
        System.out.println("Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em \n" +
                "salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar \n" +
                "os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. \n" +
                "Como você faria para descobrir, usando apenas uma ida até uma das salas das lâmpadas?\n");

        System.out.println("------------------------------");
        System.out.println("Resposta:");
        System.out.println("Ligar o primeiro interruptor (A) e deixar ligado por alguns minutos.");
        System.out.println("Desligar o primeiro interruptor (A) e ligar o segundo interruptor (B).");
        System.out.println("Ir até a sala das lâmpadas:");
        System.out.println("- A lâmpada acesa é do Interruptor B.");
        System.out.println("- A lâmpada apagada e quente é do Interruptor A.");
        System.out.println("- A lâmpada apagada e fria é do Interruptor C.");
    }
}
