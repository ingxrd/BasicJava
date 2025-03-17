
public class SintaxeBasica{
    public static void main(String[] args) {

        //Crie um programa que declare uma variável nome e imprima "Olá,[nome]!"
        /* 
         String nome =  "Ingrid";
         Scanner scanner = new Scanner(System.in);
         System.out.println("Olá," + nome + "!"); 
         */
        
         // Declare duas variáveis A e B e troque  seus valores sem usar uma terceira variável

         /* 
         int a = 1;
         int b = 1;

         a = a + b;
         b = b - a;
         Scanner scanner = new Scanner(System.in);
         System.out.println(a);
         System.out.println(b);
         */

         // Declare tres variáveis x, y, z e atribua valores a elas. Depois, imprima a soma, subtracao e multiplicacao
         /* 
         int x = 5;
         int y = 6;
         int z = 10; 
         int soma = x + y + z;
         int subtracao = x - y - z;
         int multiplicacao = x * y * z; 
         Scanner scanner = new Scanner(System.in);
         System.out.println("Soma:" + soma + "Subtracao :" + subtracao + "Multiplicacao: " + multiplicacao); 
         */

         // Crie um programa que calcule a área e um triangulo (base * altura/2)
        /* 
         double base = 20.5;
         double altura = 14.4;
         double calculoArea = (base * altura) / 2;
         
        Scanner scanner = new Scanner(System.in);
         System.out.println("Calculo da área: " + calculoArea); 

        */
         

        //Declare uma variável do tipo char, atribua uma letra e imprima o código ASCII correspondente 

        /* 
        char letra = 'A';
        int codigoASCII = (int) letra; //conversao para codigo ascc


        Scanner scaner = new Scanner(System.in);
        System.out.println("A letra: " + letra + " é o código ASCII de número: " + codigoASCII);
         */

         // Declare uma variável booleana chamada ativo e altere seu valor de true para false 
            /* 
         boolean ativo = true;
         System.out.println("Ativo? " + ativo);
         ativo = !ativo;
         System.out.println("Ativo? " + ativo);
        */
        
        //Crie um programa que converta a temperatura de celsius para fahrenheit 

            /*
        int celsius = 23;        
        double conversaoF = (celsius * 1.8 ) + 32;
        System.out.println("Resultado da conversao: " + conversaoF);
         */

         //Escreva um código que declare uma variavel idade e imprima se a pessoa é maior de idade o(18 anos ou mais)
        /* 
         int idade = 49;

         if (idade >= 18) {
            System.out.println("Maior que 18.");
         } else if (idade < 18) {
            System.out.print("Menos de 18");
         } else {
            System.out.print("Idade incorreta");
         }
         */

         // Declare duas variáveis nome e sobrenome e concatenea-as para formar o nome completo
         String nome = " Ingrid";
         String sobrenome = " Munhoz";
         System.out.print("Olá," + nome + sobrenome);
    }
}



