public class Conditionals {
    /*
     * Syntax of IF-ELSE conditions:
     * if (boolean expression - must return true or false){
     *    body
     * } else{another statement}*/
    int salary = 1000;
    void learnConditions() {
        System.out.println("*****************Conditionals - IF-ELSE statements*****************");
        if (salary > 2000) {
            salary = salary + 200;
        } else {
            salary = salary + 100;
        }
        System.out.println(salary);
    }
}
