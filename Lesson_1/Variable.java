public class Variable {
    public static void main(String[] args) {
    // Обявление в методе переменных всех существующих в Java примитивных типов данных. Каждой переменной присвоено значение.
       
        char series = 'I'; 
        int i = 5; 
        byte cores = 4; 
        short sku = 4590; 
        long graph = 4600; 
        float frequence = 3.30f; 
        double doublefreq = 3.3030d; 
        boolean conformity = true;

    // Вывод    
        System.out.println("CPU " + cores + " core " + "Intel " + series + i +"-" + sku + " CPU " + frequence + " GHz" + " (" + doublefreq + " GHz" + ")");
        System.out.println("HD Graphics " + graph);
        System.out.println(" ");
        System.out.println(conformity);
    }
}