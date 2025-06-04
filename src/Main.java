import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String strPath = "E:\\Projetos\\Java\\orderHandler";
        File diretorio = new File(strPath + "\\out");

        if(!diretorio.exists()) {
            boolean success = new File(strPath + "\\out").mkdir();
            System.out.println("Directory created successfully: " + success);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(strPath + "\\file.csv"))){
            String line = br.readLine();
            ArrayList<Product> products = new ArrayList<>();


            while (line != null){
                String[] keys = line.split(";");

                Product product = new Product(keys[0], Double.valueOf(keys[1]), Integer.valueOf(keys[2]));
                System.out.println(product.getName() + " " + product.getTotal());
                products.add(product);
                line = br.readLine();

            }

            try(BufferedWriter bfw = new BufferedWriter(new FileWriter(strPath + "\\out\\summary.csv"))){

            for(Product product : products) {
                bfw.write(product.getName() + ";" + product.getTotal() + "\n");
            }


        } catch(IOException ex) {
                System.out.println("Error in Writer: " + ex.getMessage());
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}