package command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MacroCommand implements Command {
    
    List<Command> mCommandList = new ArrayList<Command>();
    
    public void addCommand(Command c){
        mCommandList.add(c);
    }
    
    public void clearCommand(){
        mCommandList.clear();
    }

    @Override
    public void execute() {
        for (Iterator<Command> iterator = mCommandList.iterator(); iterator.hasNext();) {
            Command c = (Command) iterator.next();
            c.execute();
        }
    }

}
