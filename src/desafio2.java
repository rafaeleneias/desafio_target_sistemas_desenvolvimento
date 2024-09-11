import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        int quantidade = 0;
        for (int i = 0; i < nome.length(); i++) {
            char caractere = Character.toLowerCase(nome.charAt(i));
            if (caractere == 'a') {
                quantidade++;
            }
        }
        System.out.println("Seu nome possui um total de: " + quantidade + " A(s) no nome");
        sc.close();
    }
}
