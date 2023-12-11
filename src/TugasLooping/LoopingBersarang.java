package TugasLooping;

public class LoopingBersarang {
    public static void main(String[] args) {
        //Membuat Segitiga Menggunakan Loop Statement
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if (i == j) {
                    break;
                } else if (i + j == 9) {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
