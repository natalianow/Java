package NewRepo;

public class Taxes {
        public static void main(String[] args){
            double income = 56789;
            if(income <30000 && income >=10000){
                System.out.println("You're tax rate is 10% with a total cost of " + ((income-10000)*.1));
            }
            else if(income>=30000 && income<100000){
                System.out.println("You're tax rate is 25% with a total cost of " + ((income-10000)*.1+(income-30000)*.15));
            }
            else if(income>=100000){
                System.out.println("You're tax rate is 40% with a total cost of " + (((income-10000)*0.1)+(income-30000)*0.15+((income-100000)*0.15)));
            }
            else{
                System.out.println("You're tax rate is 0% with a total cost of 0$");
            }
        }
    }

