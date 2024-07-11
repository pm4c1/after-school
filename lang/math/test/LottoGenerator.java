package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNumbers;
    private int cnt;

    public int[] generate(){
        lottoNumbers = new int[6];
        cnt = 0;
        while(cnt < 6){
            int number = random.nextInt(45) + 1;

            if (isUnique(number)){ // bool 타입이라 true 면 실행 false 면 if 문을 나간다.
                lottoNumbers[cnt] = number;
                cnt++;
            }
        }

        return lottoNumbers;
    }

    private boolean isUnique(int num){
        for (int i=0; i<cnt; i++){
            if(lottoNumbers[i] == num){
                return false;
            }
        }
        return true;
    }
}
