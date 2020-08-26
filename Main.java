import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        PrintWriter wrt = new PrintWriter(new FileWriter("test.out"));
        Scanner scn = new Scanner(new FileReader("test.in"));
        while (scn.hasNextInt()) wrt.println(scn.nextInt()+1);
        scn.close();
         wrt.close(); 
    }
}