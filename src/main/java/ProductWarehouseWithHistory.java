public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history = new ChangeHistory();


    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        addToWarehouse(initialBalance);


    }

    public void addToWarehouse(double amount){
        if(amount>0 && (amount+currentCap<=capacity)){
            currentCap += amount;
            history.add(currentCap);
        }else if(amount>0 && (amount+currentCap>capacity)){
            double leftOver = capacity-currentCap;
            currentCap += leftOver;
            history.add(currentCap);
        }

    }

    public double takeFromWarehouse(double amount){
        if(amount<0){
            return 0;
        }else if(amount>currentCap){
            double leftOver = currentCap;
            currentCap=0;
            history.add(leftOver);
            return leftOver;
        }else{
            currentCap-=amount;
            history.add(currentCap);
            return amount;
        }

    }

    public void printAnalysis(){
        System.out.println("History: "+ history());
        System.out.println("Largest amount of product: "+history.maxValue() );
        System.out.println("Smallest amount of product: "+history.minValue());
        System.out.println("Average: "+history.average());
    }

    public String history(){
        return history.toString();
    }


}
