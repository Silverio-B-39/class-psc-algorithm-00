import java.util.Scanner;

public class App {
public static void main(String[] args) {
    String salaDesejada = "A219";
    String salaInformada = "";
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o numero da sala:");
    salaInformada = scanner.next();
    
    if (salaDesejada.equals(salaInformada)) {
    System.out.println("você encontrou a sua sala");
    

} else {
    System.out.println("você esta perdido!\nSe encontre!");
    
}
    scanner.close();
}  
}
