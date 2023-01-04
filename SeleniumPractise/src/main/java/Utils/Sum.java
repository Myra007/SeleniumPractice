package Utils;

public class Sum {

    public Sum() {
        System.out.println("Meera is HOTTT!!");
    }

    public Sum(String name) {
        System.out.println(name + " is HOTTT!!");
    }

    public int findMax(int num1, int num2){

        if(num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    public static void main(String[] args) {
        Sum sum = new Sum("Dipanshu");
    }

}
