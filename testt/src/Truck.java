public class Truck extends Transport{

    private boolean isLoaded;

    public Truck(float speed,int weight, String color, boolean isLoaded) {
        super(speed, weight, color);
        this.isLoaded = isLoaded;
    }//конструктор


    public void setValues(float speed,int weight, String color, byte[] coordinates, boolean isLoaded) {
        super.speed = speed;
        super.weight = weight;
        super.color = color;
        super.coordinates= coordinates;
        this.isLoaded = isLoaded;

    }

    @Override
    public String getValues() {
        String info = super.getValues();
        return info +  getLoaded();
    }

    public void setLoaded(boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

    public String getLoaded() {
        if(isLoaded)
            return "Truck is loaded ";
        else
            return "truck is NOT loaded";
    }

    @Override
    public void moveObject() {
        System.out.println("Object is moving");
    }

    @Override
    public void stopObject() {
        System.out.println("Object stop");
    }
}
