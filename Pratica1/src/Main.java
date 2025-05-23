import java.util.Scanner;  // Import the Scanner class

class Main {
    public static void main(String[] args) {

        int pontos = 0;
        System.out.println("Quanto eh 2+2?");
        System.out.println("A) 2");
        System.out.println("B) 3");
        System.out.println("C) 4");
        System.out.println("D) 5");
        Scanner resposta = new Scanner(System.in);  // Create a Scanner object
        System.out.println("digite a resposta");

        String respostaSelecionada = resposta.nextLine();  // Read user input

        if (respostaSelecionada.equals("C")) {
            pontos = pontos + 10;
            System.out.println("Resposta selecionada: " + respostaSelecionada + " esta correta"); // Output user input
            System.out.println("Pontos: " + pontos);

        }
        else{
            System.out.println("Resposta selecionada: " + respostaSelecionada + " esta incorreta");
            System.out.println("tente de novo");
            Scanner resposta2 = new Scanner(System.in);
            String respostaSelecionada2 = resposta2.nextLine();  // Read user input
            if (respostaSelecionada2.equals("C")) {
                pontos = pontos + 5;
                System.out.println("Resposta selecionada: " + respostaSelecionada2 + " esta correta"); // Output user input
                System.out.println("Pontos: " + pontos);
            }
            else{
                System.out.println("Resposta selecionada: " + respostaSelecionada2 + " esta incorreta");
                System.out.println("0 pontos");

            }
        }

    }
}