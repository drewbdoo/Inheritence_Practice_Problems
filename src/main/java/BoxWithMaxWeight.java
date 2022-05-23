import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
//    private int totalCap =0;

    private ArrayList<Item> boxes;

    public BoxWithMaxWeight(int capacity){
        this.capacity=capacity;
        boxes = new ArrayList<Item>();

    }

    @Override
    public void add(Item item) {
        if(item.getWeight()<=this.capacity){
            this.capacity-=item.getWeight();
            this.boxes.add(item);
        }

    }
    @Override
    public boolean isInBox(Item item) {
            return (this.boxes.contains(item));
    }
}
