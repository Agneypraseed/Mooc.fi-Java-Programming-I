
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.sum+=number;
        this.count++;
    }

    public int sum() {
        // write code here
        return this.sum;
    }

    public double average() {
        // write code here
        double avg=0;
        if(this.getCount()>0){
        avg = 1.0 * this.sum() / this.getCount();
        }
        return avg;
    }

    public int getCount() {
        return this.count;
    }
}
