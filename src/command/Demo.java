package command;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        PlayCommand pc = new PlayCommand(ap);
        ReverseCommand rc = new ReverseCommand(ap);
        StopCommand sc = new StopCommand(ap);
        MacroCommand mc = new MacroCommand();
        mc.addCommand(pc);
        mc.addCommand(sc);
        
        Keypad keypad = new Keypad(pc, rc, sc, mc);
        
        keypad.play();
        keypad.reverse();
        keypad.stop();
        keypad.macro();
    }
}
