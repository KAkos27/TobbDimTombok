package minta;

public class TobbDimenziosTombok {

    public static void main(String[] args) {
        final int SOR_DB = 3;
        final int OSZL_DD = 5;
        int[][] negyzetes = new int[SOR_DB][OSZL_DD];

        negyzetes[1][2] = 1;

        System.out.println("négyzetes:");
        for (int sor = 0; sor < SOR_DB; sor++) {
            for (int oszl = 0; oszl < OSZL_DD; oszl++) {
                System.out.print(negyzetes[sor][oszl] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        int[][] fureszes = new int[5][];
        for (int sor = 0; sor < 5; sor++) {
            for (int oszlop = 0; oszlop < 3; oszlop++) {
                int db = (int) (Math.random() * 5) + 3;
                fureszes[sor] = new int[db];
            }
        }

        fureszes[2][1] = 1;
        fureszes[1][2] = 1;

        System.out.println("fűrészes:");
        for (int sor = 0; sor < 5; sor++) {
            int oszlDb = fureszes[sor].length;
            for (int oszl = 0; oszl < oszlDb; oszl++) {
                System.out.print(fureszes[sor][oszl] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

    }

}
