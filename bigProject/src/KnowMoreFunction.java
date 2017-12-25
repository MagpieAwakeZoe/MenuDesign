import javax.swing.JMenuItem;

/**
 * Created by by on 2017/12/21.
 */
public class KnowMoreFunction extends AbstractButtonFunction{
    KnowMoreFunction(){

    }
    public  void ExecuteFunction(JMenuItem var1){
        System.out.println("按钮名:" + var1.getText());
    }
}
