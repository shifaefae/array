
public class percobaanarray2 {
 public static void main(String[] args) {
        String[][] data = {{"ABDUL", "085646668991", "Kediri"}, 
            {"KUSNO", "085646668992", "Trenggalek"}, 
            {"PONIRAN", "085646668999", "Bojonegoro"}
        };
        System.out.println("NAMA\t TELEPON\t ALAMAT\t ");
        for (String[] i : data) {
            System.out.print(i[0] + "\t");
            System.out.print(i[1] + "\t");
            System.out.print(i[2] + "\n");
        }
        System.out.println("NAMA\t TELEPON\t ALAMAT\t");
        for(int baris = 0; baris < data.length; baris++){
            System.out.print(data [baris][0] + "\t");
            System.out.print(data [baris][1] + "\t");
            System.out.print(data [baris][2] + "\n");
        }

    }
   
}
