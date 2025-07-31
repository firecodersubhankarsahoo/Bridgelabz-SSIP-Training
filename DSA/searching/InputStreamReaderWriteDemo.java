import java.io.*;

public class InputStreamReaderWriteDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        String input;
        System.out.println("Enter text (type 'exit' to finish):");
        while (!(input = br.readLine()).equals("exit")) {
            bw.write(input);
            bw.newLine();
        }
        bw.close();
    }
}

