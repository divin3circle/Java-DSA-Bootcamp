public class Prime {
    public boolean isPrime(int num){
        int c = 2;
        if(c > num){
            return  true;
        }else{
            for(int a = c; a < num; a++){
                if(num % a == 0){
                    return false;
                }else{
                    continue;
                }
            }
        }
        return true;
    }
}
