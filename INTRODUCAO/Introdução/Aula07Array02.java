package INTRODUCAO.Introdução;

public class Aula07Array02 {
    public static void main(String[] args) {
        //caso vc não declare nada dentro do array isso que será impresso com essas variáveis
        // byte, short, int, long, float e double imprime 0
        //char imprime '\000' ''
        //boolean imprime false
        //String imprime null

       /*String [] nomes = new String[4]; Uma forma de declarar arrays
            nomes[0] = "Goku";
            nomes[1] = "Vedita";
            nomes[2] = "Curirin";
            nomes[3] = "Pícuru";*/

       String [] nomes = {"Goku", "Vedita", "Curirin", "Pícuru"};// outra forma de declarar arrays

       /*for (int i = 0;i < nomes.length;i++)
        System.out.println(nomes[i]);*/

        for (String i : nomes) {// outra forma de utilizar o for
            System.out.println(i);
            }

        }
    }
    /*usamos o length para contar quantas casas tem um array neste caso 4,
    então int i = 0; 0 < 4; 0++ -> int i = 1; 1 < 4; 1++ e segue até finalizar em 4.
     */

