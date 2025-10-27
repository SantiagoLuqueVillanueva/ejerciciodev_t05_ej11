public class App {
    public static void main(String[] args) throws Exception {
        int n1 = Integer.parseInt(System.console().readLine("Introduzca un número: "));

        System.out.println("  n |  n2  |  n3");
        System.out.println("----------------");
        
        for (int i = n1; i < n1 + 5; i++){
            System.out.printf("%5d |%8d |%9d\n", i, i*i, i*i*i);
        }
    }
}
