public class Pet {
    public String name;
    public String breed;
    public int age;
    public double weight;
    public int legs;

    public double speed(){
        return weight/ 3;
    }

    public void cuteness(){
        if (age == 0){
            System.out.println("cuter than anything");
        }else if ( age == 1){
            System.out.println("cute");
        }else if (age == 3){
            System.out.println("not cute");
        }
    }

}
