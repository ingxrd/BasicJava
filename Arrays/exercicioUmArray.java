public class exercicioUmArray{
    public static void main(String[] args) {
        // Dado um array de inteiros, calcule a soma de todos os seus elementos. 
        int[] arrayNum = {1,2,3,4,5,6,7,8,9,10};
        int soma = 0; 
        int i; 

        for (i = 0; i < arrayNum.length; i++){
                soma = soma + arrayNum[i];
        }
        System.out.println("Soma:" + soma);


            
    }

}