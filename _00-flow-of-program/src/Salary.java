public class Salary {
    public int netSalary;
    public int printSalary(int salary){
        if(salary >= 10000){
            netSalary = salary + 2000;
        }else{
            netSalary = salary + 1000;
        }
        return  netSalary;
    }
}
