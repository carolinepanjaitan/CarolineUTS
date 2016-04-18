package nilairatarata;

import java.util.Scanner;

public class NilaiRataRata {

    public static void main(String[] args) {
        double ip;
        double[] nilai = new double [100];
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah IPK: ");
        double jml = input.nextDouble();
        
        double sum = 0;
        for (int i = 1; i <= jml; i++) {
            
            
                System.out.println("Nilai IPK " + i + ": " );
                nilai[i] = input.nextDouble();
                
                sum += nilai[i];
                
            }
        
        ip = sum / jml;
        int jmls = (int) (jml);
        
        System.out.println("Total nilai: " + " " + sum);
        System.out.println("IP:" + ip);
        
        if (ip >= 2.75 && ip <= 4.00)
            System.out.println("Lulus");
        else
            System.out.println("Data IP tidak valid");
    }
    
}
