import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int pontos = 0;
        
        //PRIMEIRA PERGUNTA
        System.out.println("Quanto eh 2+2?");
        System.out.println("A) 2");
        System.out.println("B) 3");
        System.out.println("C) 4");
        System.out.println("D) 5");
        Scanner resposta1 = new Scanner(System.in);  
        System.out.println("digite a resposta");
        String respostaSelecionada1 = resposta1.nextLine();  

        //Checa se a resposta esta certa
        if (respostaSelecionada1.equals("C")) {
            pontos = pontos + 10;
            System.out.println("Resposta selecionada: " + respostaSelecionada1 + " esta correta"); 
            System.out.println("Pontos: " + pontos);

        }
        //Se a resposta estiver errado, da outra chance com menos ponto
        else{
            System.out.println("Resposta selecionada: " + respostaSelecionada1 + " esta incorreta");
            System.out.println("tente de novo");
            Scanner resposta12 = new Scanner(System.in);
            String respostaSelecionada12 = resposta12.nextLine();  
            if (respostaSelecionada12.equals("C")) {
                pontos = pontos + 5;
                System.out.println("Resposta selecionada: " + respostaSelecionada12 + " esta correta"); 
                System.out.println("Pontos: " + pontos);
            }
            else{
                System.out.println("Resposta selecionada: " + respostaSelecionada12 + " esta incorreta");
                System.out.println("0 pontos");

            }
        }
        
        //SEGUNDA PERGUNTA
        System.out.println("Quanto eh 2x2?");
        System.out.println("A) 3");
        System.out.println("B) 4");
        System.out.println("C) 5");
        System.out.println("D) 6");
        Scanner resposta2 = new Scanner(System.in);  
        System.out.println("digite a resposta");
        String respostaSelecionada2 = resposta2.nextLine();  

        //Checa se a resposta esta certa
        if (respostaSelecionada2.equals("B")) {
            pontos = pontos + 10;
            System.out.println("Resposta selecionada: " + respostaSelecionada2 + " esta correta"); 
            System.out.println("Pontos: " + pontos);

        }
        //Se a resposta estiver errado, da outra chance com menos ponto
        else{
            System.out.println("Resposta selecionada: " + respostaSelecionada2 + " esta incorreta");
            System.out.println("tente de novo");
            Scanner resposta21 = new Scanner(System.in);
            String respostaSelecionada21 = resposta21.nextLine();  
            if (respostaSelecionada21.equals("B")) {
                pontos = pontos + 5;
                System.out.println("Resposta selecionada: " + respostaSelecionada21 + " esta correta"); 
                System.out.println("Pontos: " + pontos);
            }
            else{
                System.out.println("Resposta selecionada: " + respostaSelecionada21 + " esta incorreta");
                System.out.println("0 pontos");

            }
        }
        
        //TERCEIRA PERGUNTA
        System.out.println("Quanto eh 8/2?");
        System.out.println("A) 4");
        System.out.println("B) 5");
        System.out.println("C) 6");
        System.out.println("D) 7");
        Scanner resposta3 = new Scanner(System.in);  
        System.out.println("digite a resposta");
        String respostaSelecionada3 = resposta3.nextLine();  

        //Checa se a resposta esta certa
        if (respostaSelecionada3.equals("A")) {
            pontos = pontos + 10;
            System.out.println("Resposta selecionada: " + respostaSelecionada3 + " esta correta"); 
            System.out.println("Pontos: " + pontos);

        }
        //Se a resposta estiver errado, da outra chance com menos ponto
        else{
            System.out.println("Resposta selecionada: " + respostaSelecionada3 + " esta incorreta");
            System.out.println("tente de novo");
            Scanner resposta31 = new Scanner(System.in);
            String respostaSelecionada31 = resposta31.nextLine();  
            if (respostaSelecionada31.equals("A")) {
                pontos = pontos + 5;
                System.out.println("Resposta selecionada: " + respostaSelecionada31 + " esta correta"); 
                System.out.println("Pontos: " + pontos);
            }
            else{
                System.out.println("Resposta selecionada: " + respostaSelecionada31 + " esta incorreta");
                System.out.println("0 pontos");

            }
        }
        
        //QUARTA PERGUNTA
        System.out.println("Quanto eh 8-4?");
        System.out.println("A) 1");
        System.out.println("B) 2");
        System.out.println("C) 3");
        System.out.println("D) 4");
        Scanner resposta4 = new Scanner(System.in);  
        System.out.println("digite a resposta");
        String respostaSelecionada4 = resposta4.nextLine();  

        //Checa se a resposta esta certa
        if (respostaSelecionada4.equals("D")) {
            pontos = pontos + 10;
            System.out.println("Resposta selecionada: " + respostaSelecionada4 + " esta correta"); 
            System.out.println("Pontos: " + pontos);

        }
        //Se a resposta estiver errado, da outra chance com menos ponto
        else{
            System.out.println("Resposta selecionada: " + respostaSelecionada4 + " esta incorreta");
            System.out.println("tente de novo");
            Scanner resposta41 = new Scanner(System.in);
            String respostaSelecionada41 = resposta41.nextLine();  
            if (respostaSelecionada41.equals("D")) {
                pontos = pontos + 5;
                System.out.println("Resposta selecionada: " + respostaSelecionada41 + " esta correta"); 
                System.out.println("Pontos: " + pontos);
            }
            else{
                System.out.println("Resposta selecionada: " + respostaSelecionada41 + " esta incorreta");
                System.out.println("0 pontos");

            }
        }
        
        //QUINTA PERGUNTA
        System.out.println("Quanto eh 159416 / 39854?");
        System.out.println("A) 2");
        System.out.println("B) 4");
        System.out.println("C) 6");
        System.out.println("D) 8");
        Scanner resposta5 = new Scanner(System.in);  
        System.out.println("digite a resposta");
        String respostaSelecionada5 = resposta5.nextLine();  
        
        //Checa se a resposta esta certa
        if (respostaSelecionada5.equals("B")) {
            pontos = pontos + 10;
            System.out.println("Resposta selecionada: " + respostaSelecionada5 + " esta correta"); 
            System.out.println("Pontos: " + pontos);

        }
        //Se a resposta estiver errado, da outra chance com menos ponto
        else{
            System.out.println("Resposta selecionada: " + respostaSelecionada5 + " esta incorreta");
            System.out.println("tente de novo");
            Scanner resposta51 = new Scanner(System.in);
            String respostaSelecionada51 = resposta51.nextLine();  
            if (respostaSelecionada51.equals("B")) {
                pontos = pontos + 5;
                System.out.println("Resposta selecionada: " + respostaSelecionada51 + " esta correta"); 
                System.out.println("Pontos: " + pontos);
            }
            else{
                System.out.println("Resposta selecionada: " + respostaSelecionada51 + " esta incorreta");
                System.out.println("0 pontos");

            }
        }
        
        //Da a nota final baseado no numero de pontos
        if (pontos == 50) {
        System.out.println("EXCELENTE\nPONTOS TOTAIS: " + pontos);
        }
        else if(pontos < 50 && pontos > 36) {
         System.out.println("ÓTIMO\nPONTOS TOTAIS: " + pontos);
        }
        else if(pontos < 37 && pontos > 24) {
         System.out.println("BOM\nPONTOS TOTAIS: " + pontos);
        }
        else if(pontos < 25) {
         System.out.println("RUIM\nPONTOS TOTAIS: " + pontos);
        }

    }
}