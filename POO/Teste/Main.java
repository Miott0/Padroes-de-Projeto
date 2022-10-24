package Teste;
public class Main {
    public static void main(String[] args) {

        Armazenamento arm = new Armazenamento();
        arm.write("Um mago nunca se atrasa,");
        arm.printText();
        arm.write("Um mago nunca se atrasa,nem se adianta,");
        arm.printText();
        arm.write("Um mago nunca se atrasa,nem se adianta,ele chega exatamente quando pretende chegar!");
        arm.printText();

        System.out.println("\n\nApós Desfazer duas vezes");
        arm.desfazer();
        arm.desfazer();
        arm.printText();


    }
}


