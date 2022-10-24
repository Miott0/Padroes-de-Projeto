package memento.src;

import java.util.*;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        int posicoes = 0;
        Scanner sc = new Scanner(System.in);
        Armazenamento arm = new Armazenamento();
        Ficha f1 = new Ficha("null", "null");
        arm.adicionar(f1);

        System.out.println("Adicionar Objetos");
        while (true) {
            System.out.println("1-Add 2-Recuperar");int x = sc.nextInt();
            
            switch (x) {
                case 1:
                    clearBuffer(sc);
                    System.out.println("Nome");
                    f1.setNome(sc.nextLine()); 
                    System.out.println("Sobrenome");
                    f1.setSobrenome(sc.nextLine());
                    arm.adicionar(f1);
                    posicoes++;
                    
                break;
                case 2:
                    clearBuffer(sc);
                    System.out.println("Escolha qual estado recuperar: ");
                    System.out.println("Posicoes validas: " + (posicoes));
                    int y = sc.nextInt();
                    if(y != -1){
                        try {
                            arm.recuperar(y);
                            arm.imprimir();
                        } catch (Exception e) {
                            System.out.println("posicao invalida");
                        }
                    }
                    else{
                        System.out.println("posicao invalida");
                    }
                break;

                case 3 : limpaConsole();
                break;

                default:
                    System.out.println("digite opcao valida");
                break;
            }
            
        }
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    private static void limpaConsole() throws IOException, InterruptedException{
        if (System.getProperty("os.name").contains("Windows")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }else{
            Runtime.getRuntime().exec("clear");
        }
        
    }
}
