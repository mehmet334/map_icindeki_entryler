import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Verilerin tanımlanması
        Map<String,Integer> scores = new HashMap<>();

        scores.put("Ali",85);
        scores.put("Ayşe",92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        //Satır satır yazdırılması

        for (Map.Entry<String,Integer> entry : scores.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}