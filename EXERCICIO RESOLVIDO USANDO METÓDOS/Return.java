package exercicio;

public class Return {
    // CRIE UMA APLICAÇÃO QUE CALCULA AS ÀREA DO QUADRILÁTERO NOTAVEIS: QUADRADO,RETÂNGULO,TRAPÉZIO.Faça o metódo retornar valores
    public static double areaQuadrilatero(double lado){

        return  lado * lado;
    }

    public static double areQuadrilatero(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double areaQuadrilatero(double menorlado, double maiorlado, double altura){
         return ((menorlado + maiorlado) * altura) / 2;

    }

    public static void main(String[] args) {
        System.out.println(areaQuadrilatero(5));
        System.out.println(areQuadrilatero(5,5));
        System.out.println(areaQuadrilatero(7,8,9));
    }

}
