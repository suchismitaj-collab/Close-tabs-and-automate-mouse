import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;

public class CloseMultipleTabs {

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        String os = System.getProperty("os.name").toLowerCase();
        int modifierKey = os.contains("mac") ? KeyEvent.VK_META : KeyEvent.VK_CONTROL;

        int numberOfTabsToClose = 3; // change as needed
        Thread.sleep(2000); // time to focus the target window

        for (int i = 0; i < numberOfTabsToClose; i++) {
            robot.keyPress(modifierKey);
            robot.keyPress(KeyEvent.VK_W);
            robot.keyRelease(KeyEvent.VK_W);
            robot.keyRelease(modifierKey);

            Thread.sleep(500); // small delay between closes
        }
    }
}