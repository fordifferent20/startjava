public class Variable {
    public static void main(String[] args)
    {
    // Обявление в методе переменных всех существующих в Java примитивных типов данных. Каждой переменной присвоено значение.
    char c = 'I'; // Символ
    int i = 5; // Intel i5
    byte b = 4; // 4 ядра
    short s = 4590; // серия 4590
    long l = 4600; // Графика
    float f = 3.30f; // Частота GHz
    double d = 3.3030d; // Двойная точность частоты GHz
    boolean bl = true;
        System.out.println("Процессор " + b + " ядра " + "Intel " + c + i +"-" + s + " CPU " + f + " GHz" + " (" + d + " GHz" + ")");
        System.out.println("HD Graphics " + l);
        System.out.println(" ");
        System.out.println(bl);
    }
}