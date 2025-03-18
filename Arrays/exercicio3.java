
// a) totalPares: a função recebe como parâmetro um array de inteiros e 
// retorna um  número inteiro indicando o total de números pares existentes no array.  

public class exercicio3 {
    public static void main(String [] args){
        int numeros[] = {1,2,3,4,5,6};
        int totalPares = 0;

        for (int numero : numeros) { // for each, para cada numero em numeros =)
            if (numero % 2 == 0) {
                totalPares++;
            }
        }
        System.out.println("Os números pares contidos na array sao: " + totalPares);
    }
}
