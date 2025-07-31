import java.io.*;


public class ChallengeCompareDemo {
    public static void main(String[] args) throws Exception {
        int n = 1000000;
        long start, end;

        // StringBuilder
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        // StringBuffer
        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("hello");
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");

        // FileReader
        start = System.nanoTime();
        int wordCount = 0;
        BufferedReader br1 = new BufferedReader(new FileReader("bigfile.txt"));
        String line;
        while ((line = br1.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br1.close();
        end = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount + ", time: " + (end - start) + " ns");

        // InputStreamReader
        start = System.nanoTime();
        wordCount = 0;
        BufferedReader br2 = new BufferedReader(
            new InputStreamReader(new FileInputStream("bigfile.txt"), "UTF-8")
        );
        while ((line = br2.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br2.close();
        end = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount + ", time: " + (end - start) + " ns");
    }
}

