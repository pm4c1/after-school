package lang.math.test;

import java.util.Random;
import java.util.Scanner;

public class LottoGenerator {

    int[] lottoNumbers = new int[6];
    Random r = new Random();

    public int[] generate(){
        for (int i = 0; i < 6; i++) {
            lottoNumbers[i] = r.nextInt(45) + 1;

        }

        return lottoNumbers;
    }
}
