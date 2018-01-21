import java.util.Scanner;

public class Player {

    public int Choose(){
        Scanner Reader = new Scanner(System.in);
        System.out.println("Please pick a Position, 1-9");
        return Reader.nextInt();
        }


}
