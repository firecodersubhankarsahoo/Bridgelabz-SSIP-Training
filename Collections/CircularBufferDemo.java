public class CircularBufferDemo {
    static class CircularBuffer {
        private int[] buffer;
        private int size;
        private int start = 0;
        private int end = 0;
        private int count = 0;

        public CircularBuffer(int size) {
            this.size = size;
            buffer = new int[size];
        }

        public void insert(int value) {
            buffer[end] = value;
            end = (end + 1) % size;
            if (count < size) {
                count++;
            } else {
                start = (start + 1) % size; // Overwrite oldest
            }
        }

        public int[] getBuffer() {
            int[] result = new int[count];
            for (int i = 0; i < count; i++) {
                result[i] = buffer[(start + i) % size];
            }
            return result;
        }
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.insert(4);
        int[] result = buffer.getBuffer();
        System.out.print("Buffer: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

