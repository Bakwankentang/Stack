public class SeptianYogaPradana_25161562001_Stack {

    // === BAGIAN 1: Deklarasi Stack ===
    static String[] stack = new String[10];
    static int top = -1;

    // === BAGIAN 2: Operasi Stack ===

    // TODO: Lengkapi method push()
    static void push(String tiket) {
        if (top == stack.length - 1) {
            System.out.println("Stack penuh!");
        } else {
            top++;
            stack[top] = tiket;
        }
    }

    // TODO: Lengkapi method pop()
    static String pop() {
        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            String data = stack[top];
            top--;
            return data;
        }
    }

    // TODO: Lengkapi method peek()
    static String peek() {
        if (isEmpty()) {
            return "Stack kosong";
        } else {
            return stack[top];
        }
    }

    // BONUS: Method hitungTotal()
    static void hitungTotal() {
        int total = 0;

        for (int i = 0; i <= top; i++) {
            String tiket = stack[i];

            // Ambil bagian harga setelah "Rp"
            int indexRp = tiket.indexOf("Rp");
            String hargaStr = tiket.substring(indexRp + 2);

            // Hilangkan titik
            hargaStr = hargaStr.replace(".", "");

            int harga = Integer.parseInt(hargaStr);
            total += harga;
        }

        System.out.println("Total transaksi: Rp" + String.format("%,d", total).replace(",", "."));
    }

    static boolean isEmpty() {
        return top == -1;
    }

    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }
        System.out.println("=================================");
    }

    // === BAGIAN 3: Main Program ===
    public static void main(String[] args) {

        // TODO: push 3 transaksi berikut ke dalam stack:
        // "Tiket-A01: Avengers Rp50.000"
        // "Tiket-B02: Interstellar Rp45.000"
        // "Tiket-C03: Inception Rp45.000"

        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");

        // Panggil bonus
        hitungTotal();

        tampilkanStack();

        // TODO: tampilkan tiket paling atas (peek)
        System.out.println("Tiket terakhir masuk: " + peek());

        // TODO: batalkan 1 transaksi teratas (pop) dan tampilkan
        System.out.println("Tiket dibatalkan: " + pop());

        tampilkanStack();
    }
}