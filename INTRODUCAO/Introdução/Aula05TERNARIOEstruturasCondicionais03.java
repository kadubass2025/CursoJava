package INTRODUCAO.Introdução;

public class Aula05TERNARIOEstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar 500 se salário > 5000
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 para Lucas";
        String mensagemNaoDoar = "Ainda não chegou a hora, calma calabreso!!";

        //SINTAXE OPERADOR TERNÁRIO: (condição) ? verdaeiro : falso
        String Resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(Resultado);

    }

}


        //OUTRA FORMA
//        String Resultado;
//
//        if (salario > 5000){
//            Resultado = mensagemDoar;
//        }else{
//            Resultado = mensagemNaoDoar;
//        }
//        System.out.println(Resultado);
//
//
//
//    }
//}
