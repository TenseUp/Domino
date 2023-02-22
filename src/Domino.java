public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        this.top = 0;
        this.bottom = 0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){return top;}
    public int getBottom(){return bottom;}
    public void setTop(int t){top = t;}
    public void setBottom(int b){bottom = b;}
    public String toString(){return top + "/" + bottom;}
    public void flip(){
        int temp = top;
        top = bottom;
        bottom = temp;
    }
    public void settle(){if(bottom < top){flip();}}
    public int compareTo(Domino other){
        int smallest;
        int largest;
        int otherSmallest;
        int otherLargest;
        if(top > bottom){
            smallest = bottom;
            largest = top;
        } else if (bottom > top) {
            smallest = top;
            largest = bottom;
        } else{
            smallest = bottom;
            largest = top;
        }
        if(other.getTop() > other.getBottom()){
            otherSmallest = other.getBottom();
            otherLargest = other.getTop();
        } else if (other.getBottom() > other.getTop()) {
            otherSmallest = other.getTop();
            otherLargest = other.getBottom();
        } else{
            otherSmallest = other.getBottom();
            otherLargest = other.getTop();
        }
        if ((smallest == otherSmallest) && (largest == otherLargest)){return 0;} 
        if (smallest < otherSmallest){return -1;}
        if (smallest > otherSmallest){return 1;}
        if (largest < otherLargest) {return -1;}
        if(largest > otherLargest){return 1;}
        return 0;
    }
    public int compareToWeight(Domino other){
        int total = top + bottom;
        int otherTotal = other.getTop() + other.getBottom();
        if (total < otherTotal){return -1;}
        if (total > otherTotal){return 1;}
        return 0;
    }
    public boolean canConnect(Domino other){
        if(top == other.getTop()){return true;}
        if(top == other.getBottom()){return true;}
        if(bottom == other.getTop()){return true;}
        if(bottom == other.getBottom()){return true;}
        return false;
    }



}
