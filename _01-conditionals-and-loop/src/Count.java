public class Count {
    public int countInt(){
        int numberOfTimes = 0;
        int n = 77_777;
        while(n > 0){
            int rem = n % 10;
            if(rem == 7){
                numberOfTimes++;
            }
            n = n / 10;

        }
        return numberOfTimes;
    }
}
