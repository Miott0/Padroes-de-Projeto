package memento.src;

import java.util.*;



public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Armazenamento arm = new Armazenamento();

        Ficha f1 = new Ficha("null", "null", "null", "null");
        arm.add(f1.salvarEstado());
        f1.alterarValor("@email", "pedro", "Martins", "511818");
        arm.add(f1.salvarEstado());
        f1.alterarValor("@email", "augusto", "Silva", "856018");
        arm.add(f1.salvarEstado());
        f1.alterarValor("@pedro.email", "Lara", "Rocha", "874569");
        arm.add(f1.salvarEstado());
        f1.alterarValor("@email", "Alfredo", "Silva", "511818");
        arm.add(f1.salvarEstado());


        System.out.println("Total de posicoes: " + (f1.getQuantidaFichas() - 1));
        System.out.println("----Ultimo Alterecao----");
        System.out.println(f1);



        while (true) {
            System.out.println("Escolha qual estado recuperar: ");
            int x = sc.nextInt();
            if(x != -1){
                f1.recuperarEstado(arm.get(x));
                System.out.println(f1);
            }
            else{
                break;
            }
            
        }
    }
}
