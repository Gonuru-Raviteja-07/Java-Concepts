//Enum :-Special class that represents a group of constants(like final Variables)
//-> used when you need a set of pre defined constant values that are needed at the compile time of a program
enum Status {
    RUNNING, PENDING, SUCCESS;
}
public class Enums {
    public static void main(String[] args) {
        Status x = Status.PENDING;
        System.out.println(x);// pending
        System.out.println(x.ordinal());// returns the index number of the value inside enum class


        //we can use enums with switch & if statments
        switch (x) {
            case PENDING:
                System.out.println("Pending");
                break;
            case RUNNING:
                System.out.println("Running");
                break;
            default:
                System.out.println("Success");
        }

        //loop through enums
        for(Status y :Status.values()){
            System.out.println(y);
        }
    }
}
