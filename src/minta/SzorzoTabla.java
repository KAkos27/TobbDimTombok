package minta;

public class SzorzoTabla {

    public static void main(String[] args) {
        final int S = 6;
        final int O = 6;
        int[][] szorzoTabla = new int[S][O];

        for (int sor = 1; sor < S; sor++) {
            for (int oszl = 1; oszl < O; oszl++) {
                szorzoTabla[sor][oszl] = sor * oszl;
                System.out.printf("%2d ", szorzoTabla[sor][oszl]);
            }
            System.out.println("");
        }
    }
}
