public class Variable {
    public static void main(String[] args) {
        char series = 'I'; 
        int generation = 5; 
        byte cores = 4; 
        short sku = 4590; 
        long graph = 4600; 
        float frequence = 3.30f; 
        double doubleFreq = 3.3030d; 
        boolean isConformity = true;
   
        System.out.println("CPU " + cores + " core " + "Intel " + series + generation +"-" + sku + " CPU " + frequence + " GHz" + " (" + doubleFreq + " GHz" + ")");
        System.out.println("HD Graphics " + graph);
        System.out.println(" ");
        System.out.println(isConformity);
    }
}