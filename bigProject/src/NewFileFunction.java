/**
 * Created by by on 2017/12/20.
 */

import javax.swing.JMenuItem;
public class NewFileFunction extends AbstractButtonFunction{
    NewFileFunction(){
    }
    public  void ExecuteFunction(JMenuItem var1){
        System.out.println("按钮名:" + var1.getText());
    }
}
