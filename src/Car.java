public class Car {
    // Create 3 JavaClasses: Car, Pet, Phone
    // in three different branches: CarBranch, PetBranch, PhoneBranch
    // add attributes to that classes at least 5 attributes
    // add methods to that class at least 3 methods

    // after creating classes merge them to master branch
    public int doors;
    public int wheels;
    public double engine;
    public  String color;
    public String name;

    public void speed(){
        if (wheels == 2){
            System.out.println("slow");
        }else if (wheels == 4){
            System.out.println("much faster");
        }
    }

    public boolean haveInsurance(){
        if (haveInsurance()){
            return true;
        }else {
            return false;
        }
    }
}
