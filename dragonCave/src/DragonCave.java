import java.util.*;


public class DragonCave {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String numb = scan.next();
        while(true){
            System.out.println(welcome());
            try{
                System.out.println (choice(Integer.parseInt(scan.next())));
            }catch (Exception e) {
                System.out.println ("must be a number.");

        }
    }
}
public static String welcome() {
    return "njunge";
    }
public static String choice(int x) {
    if (x == 1) {
        return "approach";
    }else if (x == 2) {
        return "run";
    }else if (x == 0 ){
        return "bye";
    }else return "enter num";
}
}