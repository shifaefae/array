
public class ratarataarray {
 public static void main(String[] args) {
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        int total = 0;
        int jml_index = 0;
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                System.out.print(data[a][b] + " ");
                total += data[a][b];
                jml_index++;

            }
            System.out.println("\n");

        }
        double rata = total / jml_index;
        
        System.out.println("total : " + total);
        System.out.println("jumlah index :" + jml_index);
        System.out.println("rata-rata : " + rata);
    }
    
}

    

