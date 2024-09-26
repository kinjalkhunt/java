
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class msg {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String msg = scanner.nextLine();

        System.out.print("Enter the message count: ");
        int n = scanner.nextInt();

        Thread.sleep(3000);

        for (int i = 0; i < n; i++) {
            typeMessage(robot, msg);
            pressEnter(robot);
        }
    }

    public static void typeMessage(Robot robot, String msg) {
        for (char c : msg.toCharArray()) {
            int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
            robot.keyPress(keyCode);
            robot.keyRelease(keyCode);
        }
    }

    public static void pressEnter(Robot robot) {
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
