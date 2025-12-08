import java.util.ArrayList;

public class Box {
    ArrayList<Thing> contents = new ArrayList<>();

    Box(){
        System.out.println("Box créée !");
    }

    public void add (Thing truc){
        contents.add(truc);
    }

    public boolean contains(Thing truc) {
       return this.contents.contains(truc);
    }

    void remove(Thing truc) throws RuntimeException {

        boolean ok = this.contents.remove(truc);
        if (!ok) throw new RuntimeException("Remove impossible!");
    }
}



