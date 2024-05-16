import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentInput {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int i = 1;

        while (true) {
            try {
                System.out.print("Masukkan nama ke-" + i + ": ");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("selesai")){
                    break;
                }
                if (input.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                }

                students.add(input);
                i++;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Input harus berupa string!");
            }
        }

        System.out.println("Daftar mahasiswa yang diinputkan: ";
        for (String student : students) {
            System.out.println(student);

        }
    }
}