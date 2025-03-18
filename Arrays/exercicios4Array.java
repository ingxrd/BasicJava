public class exercicios4Array {
    public static void main(String [] args) {
        int primeiros[] = {1,2,3};
        int segundos[] = {4,5,6};
        int totalPrimeiro = 0;
        int totalSegundo = 0;

        for ( int i : primeiros){
            totalPrimeiro++;
            } 
            for (int j : segundos) {
                totalSegundo++;
        }

        int quantidadeTotal = totalPrimeiro + totalSegundo;
        System.out.println("Total de numeros: " + quantidadeTotal);


        
    }
}
