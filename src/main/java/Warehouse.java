public class Warehouse {

    double capacity;
    double currentCap;

    public Warehouse(double capacity){
        this.capacity=capacity;
        this.currentCap=0.0;

    }

    public double getBalance(){
        return currentCap;
    }

    public double getCapacity(){
        return capacity;
    }

    public double howMuchSpaceLeft(){
        return Math.round((capacity - currentCap)*10.0)/10.0;
//        return capacity-currentCap;
    }

    public void addToWarehouse(double amount){
        if(amount>0 && (amount+currentCap<=capacity)){
            currentCap += amount;
        }else if(amount>0 && (amount+currentCap>capacity)){
            double leftOver = capacity-currentCap;
            currentCap += leftOver;
        }
    }

    public double takeFromWarehouse(double amount){
        if(amount<0){
            return 0;
        }else if(amount>currentCap){
            double leftOver = currentCap;
            currentCap=0;
            return leftOver;
        }else{
            currentCap-=amount;
            return amount;
        }
    }

    @Override
    public String toString() {
        return "balance = " + getBalance() + ", space left "+ howMuchSpaceLeft();

    }
}
