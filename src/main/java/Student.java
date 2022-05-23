public class Student extends Person{
    int credits = 0;

    public Student(String name, String address) {
        super(name, address);
           }

    public void study(){
        credits ++;

    }


    public String credits() {
        return "Study credits "+this.credits;
    }

    @Override
    public String toString() {
        return this.name + "\n"+ "    " + this.address+ "\n"+ "    " + credits();
    }
}
