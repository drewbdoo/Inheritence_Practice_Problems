import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    ArrayList<Double> state;

    public ChangeHistory(){
        this.state = new ArrayList<>();

    }
    public void add(double status){
        state.add(status);

    }
    public void clear(){
        state.clear();
    }

    public double maxValue(){
        return Collections.max(state);
    }
    public double minValue(){
        return Collections.min(state);
    }

    public double average(){
        double total = 0;
        double avg = 0;
        if(state.size()==0){
            return 0;
        }
        for(int i=0; i<state.size(); i++) {
            total += state.get(i);
            avg = total / state.size();
        }
        return Math.round((avg)*10.0)/10.0;
    }


    @Override
    public String toString() {
        return state.toString();
    }
}
