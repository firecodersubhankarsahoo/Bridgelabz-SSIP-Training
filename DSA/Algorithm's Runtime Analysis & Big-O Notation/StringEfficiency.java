public class StringEfficiency {
    public static void main(String[] args) {
        int iterations = 50000;

        long start1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < iterations; i++) s += i;
        long end1 = System.currentTimeMillis();
        System.out.println("String time: " + (end1 - start1) + "ms");

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) sb.append(i);
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end2 - start2) + "ms");

        long start3 = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < iterations; i++) sf.append(i);
        long end3 = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end3 - start3) + "ms");
    }
}
