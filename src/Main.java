import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String path = "E://Projetos//Java//orderHandler//file.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}