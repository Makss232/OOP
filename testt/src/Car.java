public class Car extends Transport{

    public Car(float _speed,int _weight, String _color, byte[] _coordinates) {
        setValues(_speed, _weight, _color, _coordinates);
        System.out.println(getValues());
    }

    @Override
    public void moveObject() {

    }

    @Override
    public void stopObject() {
        System.out.println("Object stopped");
    }


}
