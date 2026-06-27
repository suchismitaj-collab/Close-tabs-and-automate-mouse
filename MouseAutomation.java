import java.awt.Robot;

public class MouseAutomation{

    public static void main(String[] args){
        try{
            Robot robot = new Robot();
            System.out.println("Your mouse will move in 3 seconds");
            Thread.sleep(3000);


            robot.mouseMove(500, 300);

            System.out.println("Done!");


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}