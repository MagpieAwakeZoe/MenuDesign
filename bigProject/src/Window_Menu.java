/**
 * Created by by on 2017/12/21.
 */
import JDBC.DBCon;
import JDBC.MenuModel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class Window_Menu extends JFrame {
    JMenuBar menubar;
    JMenu menu1,menu2,menu3;
    JMenu subMenu1;
    JMenu subMenu2;
    MapMenuItem item1;
    MapMenuItem item2;
    MapMenuItem item3;
    MapMenuItem item4;
//    MapMenuItem itemSave;

    public Window_Menu(){

    }

    public Window_Menu(String var1, int var2, int var3, int var4, int var5 ){
        this.init(var1);                    //初始化
        this.setLocation(var2, var3);       //设置窗口位置
        this.setSize(var4, var5);           //设置窗口大小
        this.setVisible(true);              //设置窗口可视化
        this.setDefaultCloseOperation(2);   //设置默认关闭事件
    }

    void init(String var1){
        this.setTitle(var1);
        this.menubar = new JMenuBar(); //建立菜单横条实例
        List<MenuModel> list = DBCon.getMenuData();
        //文件菜单
//            String Menu2Name1 = list.get().getMENU2NAME();
            String File = list.get(0).getMENU0NMAE();    //文件菜单的一级菜单名称：文件
            String NewFile = list.get(0).getMENU1NAME();    //文件菜单的二级菜单名称：新建文件
            String Open = list.get(1).getMENU1NAME();    //文件菜单的二级菜单名称：打开
            String Save = list.get(2).getMENU1NAME();    //文件菜单的二级菜单名称：保存
            String Save0 = list.get(2).getMENU2NAME();    //文件菜单的三级菜单名称：保存
            String Save0As = list.get(3).getMENU2NAME();    //文件菜单的三级菜单名称：另存为

        //编辑菜单
        String Edit = list.get(4).getMENU0NMAE();    //文件菜单的一级菜单名称：编辑
        String Shear = list.get(4).getMENU1NAME();    //文件菜单的二级菜单名称：剪切
        String Copy = list.get(5).getMENU1NAME();    //文件菜单的二级菜单名称：复制
        String Delete = list.get(6).getMENU1NAME();    //文件菜单的二级菜单名称：删除
        String Paste = list.get(7).getMENU1NAME();    //文件菜单的二级菜单名称：粘贴
        String Paste0 = list.get(7).getMENU2NAME();    //文件菜单的三级菜单名称：粘贴
        String Paste0As = list.get(8).getMENU2NAME();    //文件菜单的三级菜单名称：选择性粘贴


        //帮助菜单
        String Help = list.get(9).getMENU0NMAE();    //文件菜单的一级菜单名称：帮助
        String Question = list.get(9).getMENU1NAME();    //文件菜单的二级菜单名称：疑问
        String Help0 = list.get(10).getMENU1NAME();    //文件菜单的二级菜单名称：帮助
        String KnowMore = list.get(11).getMENU1NAME();    //文件菜单的二级菜单名称：了解更多
        String View = list.get(12).getMENU1NAME();    //文件菜单的二级菜单名称：查看
        String View0 = list.get(12).getMENU2NAME();    //文件菜单的三级菜单名称：查看
        String ViewWeb = list.get(13).getMENU2NAME();    //文件菜单的三级菜单名称：查看网站


//            菜单第一列
            this.menu1 = new JMenu(File);       //一级菜单
            this.subMenu1 = new JMenu(Save);    //二级菜单(含有3级菜单)
            this.item1 = new MapMenuItem(NewFile, new ImageIcon("img/a.gif"),"NewFileFunction");      //2级菜单
            this.item2 = new MapMenuItem(Open, new ImageIcon("img/b.gif"),"OpenFunction");   //2级菜单
            this.item1.setAccelerator(KeyStroke.getKeyStroke('A'));                     //添加注释
            this.item2.setAccelerator(KeyStroke.getKeyStroke(83,2));//添加注释

            this.menu1.add(this.item1);    //添加二级菜单--新建文件
            this.menu1.addSeparator();           //添加分隔符
            this.menu1.add(this.item2);       //添加二级菜单--打开文件
            this.menu1.add(this.subMenu1);        //添加子菜单--保存

            this.subMenu1.add(new MapMenuItem(Save0,new ImageIcon("img/c.gif"),"SavaFunction"));        //子菜单添加三级菜单--保存
            this.subMenu1.add(new MapMenuItem(Save0As,new ImageIcon("img/d.gif"),"SaveAsFunction"));     //子菜单添加三级菜单--另存为



        //            菜单第二列
        this.menu2 = new JMenu(Edit);       //一级菜单
        this.subMenu1 = new JMenu(Paste);    //二级菜单(含有3级菜单)
        this.item1 = new MapMenuItem(Copy, new ImageIcon("img/a.gif"),"CopyFunction");      //2级菜单
        this.item2 = new MapMenuItem(Shear, new ImageIcon("img/b.gif"),"ShearFunction");   //2级菜单
        this.item3 = new MapMenuItem(Delete, new ImageIcon("img/b.gif"),"DeleteFunction");   //2级菜单

        this.item1.setAccelerator(KeyStroke.getKeyStroke('A'));                     //添加注释
        this.item2.setAccelerator(KeyStroke.getKeyStroke(83,2));//添加注释

        this.menu2.add(this.item1);    //添加二级菜单--新建文件
        this.menu2.addSeparator();           //添加分隔符
        this.menu2.add(this.item2);       //添加二级菜单--打开文件
        this.menu2.add(this.item3);       //添加二级菜单--删除文件
        this.menu2.add(this.subMenu1);        //添加子菜单--保存

        this.subMenu1.add(new MapMenuItem(Paste0,new ImageIcon("img/c.gif"),"PasteFunction"));        //子菜单添加三级菜单--保存
        this.subMenu1.add(new MapMenuItem(Paste0As,new ImageIcon("img/d.gif"),"SelectivePasteFunction"));     //子菜单添加三级菜单--另存为

        //          菜单第三列
        this.menu3 = new JMenu(Help);       //一级菜单
        this.subMenu1 = new JMenu(View);    //二级菜单(含有3级菜单)
        this.item1 = new MapMenuItem(Question, new ImageIcon("img/a.gif"),"QuestionFunction");      //2级菜单
        this.item2 = new MapMenuItem(Help0, new ImageIcon("img/b.gif"),"HelpFunction");   //2级菜单
        this.item3 = new MapMenuItem(KnowMore, new ImageIcon("img/b.gif"),"KnowMoreFunction");   //2级菜单


        this.item1.setAccelerator(KeyStroke.getKeyStroke('A'));                     //添加注释
        this.item2.setAccelerator(KeyStroke.getKeyStroke(83,2));//添加注释

        this.menu3.add(this.item1);    //添加二级菜单--新建文件
        this.menu3.addSeparator();           //添加分隔符
        this.menu3.add(this.item2);       //添加二级菜单--打开文件
        this.menu3.add(this.item3);       //添加二级菜单--了解更多
        this.menu3.add(this.subMenu1);        //添加子菜单--保存

        this.subMenu1.add(new MapMenuItem(View0,new ImageIcon("img/c.gif"),"ViewFunction"));        //子菜单添加三级菜单--保存
        this.subMenu1.add(new MapMenuItem(ViewWeb,new ImageIcon("img/d.gif"),"ViewWebsiteFunction"));     //子菜单添加三级菜单--另存为


        this.menubar.add(this.menu1);   //添加主菜单1
        this.menubar.add(this.menu2);   //添加主菜单2
        this.menubar.add(this.menu3);   //添加主菜单3
            this.setJMenuBar(this.menubar);
        }
}
