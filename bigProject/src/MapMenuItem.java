/**
 * Created by by on 2017/12/21.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JMenuItem;
import static java.lang.Class.forName;

public class MapMenuItem extends JMenuItem implements ActionListener{
    String buttonFunctionClassName;

    MapMenuItem(String var1){
        this.addActionListener(this);
        this.buttonFunctionClassName = var1;
    }

    MapMenuItem(String var1, Icon var2, String var3){
        super(var1, var2);
        this.addActionListener(this);
        this.buttonFunctionClassName = var3;
    }

    MapMenuItem(String var1, String var2){
        super(var1);
        this.addActionListener(this);
        this.buttonFunctionClassName = var2;
    }

    MapMenuItem(Icon var1, String var2){
        super(var1);
        this.addActionListener(this);
        this.buttonFunctionClassName = var2;
    }

    public  void actionPerformed(ActionEvent var1){
        try{
            Class var3 = forName(this.buttonFunctionClassName);
            AbstractButtonFunction var2 = (AbstractButtonFunction)var3.newInstance();
            var2.ExecuteFunction(this);
        }catch (Exception var4){
            System.out.println("按钮的功能类:(" + this.buttonFunctionClassName + ")没定义!");
        }
    }
}


