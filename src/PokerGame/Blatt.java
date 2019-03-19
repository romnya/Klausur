package PokerGame;

import java.util.Arrays;

public class Blatt  {
    public int[] b;

    public Blatt(int[] b) {
        if (!(b.length == 2)) {
            throw new IndexOutOfBoundsException();
        }

        if (!(Arrays.stream(b).min().getAsInt() > 0 && Arrays.stream(b).max().getAsInt() < 15)) {
            throw new NumberFormatException();

        }

        this.b = b;
    }







    public int compareTo(Blatt b) {
        boolean bo = b.b[0] == b.b[1];
        boolean ao = this.b[0] == this.b[1];
        if (bo && ao) {

            return this.b[0] - b.b[0];
        }
        else if (bo) {
            return -1;
        }
        else if (ao) {
            return 1;
        }
        else {
            return this.b[0] + this.b[1] - b.b[0] - b.b[1];
        }
    }
}
