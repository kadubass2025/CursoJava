package INTRODUCAO;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while , for

        int cont = 0;
        while (cont <= 10){
            System.out.print( cont + " ");
            cont++;
        }
        System.out.println();
        cont = 0;
        do {
            System.out.println("Aqui é dentro do DO WHILE");
            cont++;
        }while (cont <= 10);

        for (int i=0; i<=10; i++){
            System.out.print("For" + i + " ");
        }


        }
    }

