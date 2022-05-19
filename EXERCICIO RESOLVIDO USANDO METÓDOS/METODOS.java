package exercicio;

public class METODOS {
    // CALCULE AS 4 OPERAÇÕES BÁSICAS: SOMA, SUBTRAÇÃO, MULTPLICAÇÃO E DISIVÃO.SEMPRE 2 VALORES DEVEM SER PASSADOS;
    public static void soma (double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("A SOMA DE " + numero1 + " MAIS " + numero2 +" = "+resultado);
    }

   public static void subtatracao (double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A SUBTRAÇÃO DE " + numero1 + " MENOS " + numero2 +" = "+resultado);
   }

   public static void multiplicacao(double numero1, double numero2){
       double resultado = numero1 * numero2;
       System.out.println("A MULTIPLICAÇÃO DE " + numero1 + " MULTIPLICADO POR " + numero2 +" = "+resultado);
   }

   public static void divisao(double numero1, double numero2){
       double resultado = numero1 / numero2;
       System.out.println("A DIVISÃO DE " + numero1 + " DIVIDIDO POR " + numero2 +" = "+resultado);

   }
  // APATIR DA HORA DO DIA INFORME A MENSAGEM ADQUADA: BOM DIA, BOA TARDE, BOA NOITE

    public static void obterMesagem(float hora){
        if( hora>= 5 && hora < 13){
                  mensagemBomDia();
        }
        else if (hora >= 13 && hora <=17){
            mensagemBoaTarde();
        }

        else{
            mensagemBoaNoite();

        }}

    public static void mensagemBomDia(){
            System.out.println("BOM DIA");
    }

    public static void mensagemBoaTarde(){
        System.out.println("BOA TARDE");
    }
    public static void mensagemBoaNoite(){
        System.out.println("BOA NOITE");
    }


    // EMPRÉSTIMO


    // RETONANDO A TAXA DE JURO
    public static double taxaDuasParcelas(){
           return 0.3;}

    public static double taxaTresParcelas(){
        return 0.45;
    }

    // QUANTIDADE DE PARCELAS
    public static int total2Parcelas(){
        return 2;
    }
   public static int total3Parcela(){
        return 3;
   }




    public static void emprestimo(double valor,int parcela){

        if(parcela == 2){
            double valorfinal = valor + (valor * taxaDuasParcelas());
            System.out.println("O VALOR FINAL DO EMPRÉSTIMO PARA DUAS PARCELAS: R$  "+ valorfinal);
        }

        else if (parcela == 3) {
            double valorfinal = valor + (valor * taxaTresParcelas());
            System.out.println("O VALOR FINAL DO EMPRÉSTIMO PARA TRÊS PARCELAS: R$  "+ valorfinal);
        } else  {
            System.out.println("QUANTIDADE DE PARCELAS NÃO ACEITA.");

        }


    }









    public static void main(String[] args) {
        soma(4,6);
        subtatracao(2,5);
        multiplicacao(4,5);
        divisao(10,2);
        System.out.println(">>>>>>>>>>>>>>");

        obterMesagem(8);

        System.out.println(">>>>>>>>>>>>>>");

        emprestimo(1000,2);
        emprestimo(1000,3);

        System.out.println(">>>>>>>>>>>>>>");

        emprestimo(1000,total2Parcelas());
        emprestimo(1000,total3Parcela());


















    }
}
