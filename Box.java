import java.util.ArrayList;

public class Box {
    ArrayList<Thing> contents = new ArrayList<>();
    int capacity;

    Box(){
        System.out.println("Box créée !");
        this.capacity = -1;
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

    public void add (Thing truc)throws RuntimeException{
        if (this.capacity!=-1){
            if (this.capacity-truc.getVolume()>=0){
                this.contents.add(truc);
                this.capacity-=truc.getVolume();
            }
            else throw new RuntimeException("Boite pleine");
        }
        else this.contents.add(truc);

    }

    public boolean contains(Thing truc) {
       return this.contents.contains(truc);
    }

    void remove(Thing truc) throws RuntimeException {

        boolean ok = this.contents.remove(truc);
        if (!ok) throw new RuntimeException("Remove impossible!");
    }
}



