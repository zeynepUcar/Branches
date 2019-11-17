public class Phone {
    public String name;
    public String color;
    public int price;
    public int pixel;
    public int camera;

    public void price() {
        if (price >= 1000) {
            System.out.println("brand is apple");
        } else if (price <= 1000) {
            System.out.println("it is nokia");
        }
    }

    public boolean haveTwoCamera(){
        if (haveTwoCamera()){
            return  true;
        }else {
            return false;
        }

    }

}
