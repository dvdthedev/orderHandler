import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String strPath = "E:\\Projetos\\Java\\orderHandler";
        File diretorio = new File(strPath + "\\out\\summary.csv");

        if(!diretorio.exists()) {
            boolean success = new File(strPath + "\\out\\summary.csv").mkdir();
            System.out.println("Directory created successfully: " + success);
        }

        try (BufferedReader br = new BufferedReader(new FileReader(strPath + "//file.csv"))){

            String line = br.readLine();

            ArrayList<Product> products = new ArrayList<Product>();

            while (line != null){
                String[] keys = line.split(";");
                System.out.println(Arrays.stream(keys).toList());
                Product product = new Product(keys[0], Double.valueOf(keys[1]), Integer.valueOf(keys[2]));
                System.out.println(product.getName() + " " + product.getTotal());
                line = br.readLine();
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}