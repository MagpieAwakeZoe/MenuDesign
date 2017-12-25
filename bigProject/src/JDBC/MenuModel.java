package JDBC;

/**
 * Created by by on 2017/12/25.
 */
public class MenuModel {
    public MenuModel(){

    }



    private String MENUID;
    private String MENU0NMAE;
    private String MENU1NAME;
    private String MENU2NAME;

    public MenuModel(String MENUID, String MENU0NMAE, String MENU1NAME, String MENU2NAME) {
        this.MENUID = MENUID;
        this.MENU0NMAE = MENU0NMAE;
        this.MENU1NAME = MENU1NAME;
        this.MENU2NAME = MENU2NAME;
    }

    public void setMENUID(String MENUID) {
        this.MENUID = MENUID;
    }

    public void setMENU0NMAE(String MENU0NMAE) {
        this.MENU0NMAE = MENU0NMAE;
    }

    public void setMENU1NAME(String MENU1NAME) {
        this.MENU1NAME = MENU1NAME;
    }

    public void setMENU2NAME(String MENU2NAME) {
        this.MENU2NAME = MENU2NAME;
    }



    public String getMENUID() { return MENUID; }

    public String getMENU0NMAE() {
        return MENU0NMAE;
    }

    public String getMENU1NAME() {
        return MENU1NAME;
    }

    public String getMENU2NAME() {
        return MENU2NAME;
    }

}
