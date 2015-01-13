package command;

public class Keypad {
    private Command playCommand;
    private Command reverseCommand;
    private Command stopCommand;
    private Command macroCommand;
    
    public Keypad(Command play, Command reverse, Command stop, Command macro){
        playCommand = play;
        reverseCommand = reverse;
        stopCommand = stop;
        macroCommand = macro;
    }
    
    public void play(){
        playCommand.execute();
    }
    
    public void reverse(){
        reverseCommand.execute();
    }
    
    public void stop(){
        stopCommand.execute();
    }
    
    public void macro(){
        macroCommand.execute();
    }
}
