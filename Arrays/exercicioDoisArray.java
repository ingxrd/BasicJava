public class exercicioDoisArray{
    public static void main(String[] args){
        int numeros[] = {1,2,3,4,5,6, 7, 9, 10, -1, 93849384};
        int menorNumero = numeros[0];
        int maiorNumero = numeros[0];

        for (int numero : numeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            } else if (numero > maiorNumero) {
                maiorNumero = numero; 
            }
        }
        System.out.println("O menor número na array é: " + menorNumero);
        System.out.println("O maior número é: " + maiorNumero);
    }
}
