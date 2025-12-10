public class Thing{
    private String name;
    private int volume;


    public Thing(String name){
        this.name = name;
    }
    /**
     * Instancie une chose avec un nom
     * 
     * @param name (String) : nom
     * * @param volume (int) : volume
     */
    public Thing(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public String getName(){
        return this.name;
    }

    public int getVolume(){
        return this.volume;
    }
}