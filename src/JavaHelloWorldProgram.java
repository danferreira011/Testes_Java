public class JavaHelloWorldProgram {
    
    public static void valor(String args[]){
        // este é um bloco de programação
        int a=10;
        int b=1;
        if (b==3) {
        // este é um bloco que é executado se b for igual a 3
        b=a*10;
        } else {
        // este é um bloco que é executado se b for diferente de 3
        a=100;
        b=a*10;
        }
        System.out.println("O valor de b é " + b);
        }

    public static void main(String args[]){
        System.out.println("Hello World");
        valor(args);
        }    
            
}
