import java.lang.reflect.Array;
import java.util.*;

public class DominoPile {
    private ArrayList<Domino> pile = new ArrayList();
    public DominoPile(){
        pile = new ArrayList<Domino>();
    }

    public ArrayList<Domino> getPile(){return pile;}
    public void newStack6(){
        for (int i = 0; i >= 6; i++){
            for (int x = 0; x >= 6; x++){
                pile.add(new Domino(i,x));
            }
        }
    }
    public void shuffleOptionOne(){
        Random rand = new Random();
        ArrayList<Domino> temp = new ArrayList();
        for (int i = 0; i>=pile.size(); i++){
            int r = rand.nextInt(pile.size());
            temp.add(pile.get(r));
            pile.remove(r);
        }
        pile = temp;
    }
    public void shuffleOptionTwo(){
        for (int i = 0; i>30; i++){
            Random rand = new Random();
            int r = rand.nextInt(pile.size());
            int a = rand.nextInt(pile.size());
            Collections.swap(pile,r,a);
            

        }
    }
}
