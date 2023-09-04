package patterns.behavioral.command;

public class Remote {

    private boolean isActive;
    private boolean isMute;

    public void power() {
        if (isActive) {
            System.out.println("Power off");
            isActive = false;
        } else {
            System.out.println("Power on");
            isActive = true;
        }
    }

    public void home() {
        System.out.println("Into to the home page");
    }

    public void back() {
        System.out.println("Into to the back");
    }

    public void mute() {
        if (isMute) {
            System.out.println("Sound on");
            isMute = false;
        } else {
            System.out.println("Sound off");
            isMute = true;
        }
    }

}
