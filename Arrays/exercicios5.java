/*
 * c) totalIguais: a função recebe como parâmetro dois arrays de inteiros e 
 * retorna o  total de números iguais existentes em ambos os arrays.  
 */

 public class exercicios5 {
    public static void main(String[] args){
        int array1[] = {1,2,3};
        int array2[] = {4,5,6};

        int totalIguais = 0;

        for (int i : array1){
            for (int j : array2) {
                if (i == j){
                    totalIguais++;
            }
            }
            
        }
        System.out.println("Total dos valores iguais: " + totalIguais);

    }
}
