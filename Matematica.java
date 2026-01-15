public class Matematica {
    public int suma(int a, int b) {
        return a + b;
    }
    
    public double raport(int a, int b) {
        return (double) a / b;
    }
    
    public boolean estePar(int n) {
        return n % 2 == 0;
    }
    
    public int nNumerePare(int[] numbers) {
        int count = 0;
        for (int n : numbers) {
            if (estePar(n)) count++;
        }
        return count;
    }
}
