import javax.swing.JMenuItem;

/**
 * Created by by on 2017/12/21.
 */
public class OpenFunction extends AbstractButtonFunction{
    OpenFunction(){

    }
    public void ExecuteFunction(JMenuItem var1){
        System.out.println("按钮名:" + var1.getText());
    }
}
