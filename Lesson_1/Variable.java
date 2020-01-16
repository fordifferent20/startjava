public class Variable {
    public static void main(String[] args)
    {
    // Обявление в методе переменных всех существующих в Java примитивных типов данных. Каждой переменной присвоено значение.
        char c = 'I'; 
        int i = 5; 
        byte b = 4; 
        short s = 4590; 
        long l = 4600; 
        float f = 3.30f; 
        double d = 3.3030d; 
        boolean bl = true;

    // Вывод    
        System.out.println("CPU " + b + " core " + "Intel " + c + i +"-" + s + " CPU " + f + " GHz" + " (" + d + " GHz" + ")");
        System.out.println("HD Graphics " + l);
        System.out.println(" ");
        System.out.println(bl);
    }
}