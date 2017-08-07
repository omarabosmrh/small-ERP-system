package view.backing;

import java.sql.ResultSet;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.DbClass;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichDecorativeBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.output.RichImage;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichSpacer;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.component.UIXGroup;

public class Start {
    private RichPanelStretchLayout psl1;
    private RichForm f1;
    private RichDocument d1;
    private RichDecorativeBox db1;
    private RichImage i1;
    private RichPanelBox pb1;
    private RichPanelBox pb2;
    private RichPanelBox pb3;
    private RichMessages m1;
    private RichPanelFormLayout pfl1;
    private RichInputText it1;
    private RichInputText it2;
    private RichPanelGroupLayout pgl1;
    private RichSpacer s1;
    private RichCommandButton cb5;
    private RichCommandButton cb6;
    private RichPanelSplitter ps1;
    private RichPanelSplitter ps2;
    private RichPanelBox pb4;
    private RichPanelBox pb5;
    private RichPanelBox pb6;
    private RichTable t1;
    private RichCommandButton cb1;
    private UIXGroup g1;
    private RichCommandButton cb2;
    private RichPanelFormLayout pfl2;
    private RichInputText it5;
    private RichInputText it6;
    private RichPanelGroupLayout pgl2;
    private RichSpacer s2;
    private RichCommandButton cb3;
    private RichCommandButton cb4;
    private RichCommandButton cb7;
    private RichCommandButton cb8;
    private RichCommandButton cb9;
    private RichCommandButton cb10;
    private RichTable t2;
    private RichCommandButton cb11;
    private UIXGroup g2;
    private RichCommandButton cb12;
    private RichPanelGroupLayout pgl3;
    private RichCommandButton cb13;
    private RichCommandButton cb14;
    private RichInputText it8;
    private RichCommandButton cb15;
    private RichCommandButton cb16;
    private RichInputText it9;

    public Start() {
        //newLogin_action();
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setDb1(RichDecorativeBox db1) {
        this.db1 = db1;
    }

    public RichDecorativeBox getDb1() {
        return db1;
    }

    public void setI1(RichImage i1) {
        this.i1 = i1;
    }

    public RichImage getI1() {
        return i1;
    }

    public void setPb1(RichPanelBox pb1) {
        this.pb1 = pb1;
    }

    public RichPanelBox getPb1() {
        return pb1;
    }

    public void setPb2(RichPanelBox pb2) {
        this.pb2 = pb2;
    }

    public RichPanelBox getPb2() {
        return pb2;
    }

    public void setPb3(RichPanelBox pb3) {
        this.pb3 = pb3;
    }

    public RichPanelBox getPb3() {
        return pb3;
    }

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setS1(RichSpacer s1) {
        this.s1 = s1;
    }

    public RichSpacer getS1() {
        return s1;
    }


    public void setCb5(RichCommandButton cb5) {
        this.cb5 = cb5;
    }

    public RichCommandButton getCb5() {
        return cb5;
    }

    public void setCb6(RichCommandButton cb6) {
        this.cb6 = cb6;
    }

    public RichCommandButton getCb6() {
        return cb6;
    }

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }

    public void setPs2(RichPanelSplitter ps2) {
        this.ps2 = ps2;
    }

    public RichPanelSplitter getPs2() {
        return ps2;
    }

    public void setPb4(RichPanelBox pb4) {
        this.pb4 = pb4;
    }

    public RichPanelBox getPb4() {
        return pb4;
    }

    public void setPb5(RichPanelBox pb5) {
        this.pb5 = pb5;
    }

    public RichPanelBox getPb5() {
        return pb5;
    }

    public void setPb6(RichPanelBox pb6) {
        this.pb6 = pb6;
    }

    public RichPanelBox getPb6() {
        return pb6;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setCb1(RichCommandButton cb1) {
        this.cb1 = cb1;
    }

    public RichCommandButton getCb1() {
        return cb1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setCb2(RichCommandButton cb2) {
        this.cb2 = cb2;
    }

    public RichCommandButton getCb2() {
        return cb2;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setS2(RichSpacer s2) {
        this.s2 = s2;
    }

    public RichSpacer getS2() {
        return s2;
    }

    public void setCb3(RichCommandButton cb3) {
        this.cb3 = cb3;
    }

    public RichCommandButton getCb3() {
        return cb3;
    }

    public void setCb4(RichCommandButton cb4) {
        this.cb4 = cb4;
    }

    public RichCommandButton getCb4() {
        return cb4;
    }

    public void setCb7(RichCommandButton cb7) {
        this.cb7 = cb7;
    }

    public RichCommandButton getCb7() {
        return cb7;
    }

    public void setCb8(RichCommandButton cb8) {
        this.cb8 = cb8;
    }

    public RichCommandButton getCb8() {
        return cb8;
    }

    public void setCb9(RichCommandButton cb9) {
        this.cb9 = cb9;
    }

    public RichCommandButton getCb9() {
        return cb9;
    }

    public void setCb10(RichCommandButton cb10) {
        this.cb10 = cb10;
    }

    public RichCommandButton getCb10() {
        return cb10;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setCb11(RichCommandButton cb11) {
        this.cb11 = cb11;
    }

    public RichCommandButton getCb11() {
        return cb11;
    }

    public void setG2(UIXGroup g2) {
        this.g2 = g2;
    }

    public UIXGroup getG2() {
        return g2;
    }

    public void setCb12(RichCommandButton cb12) {
        this.cb12 = cb12;
    }

    public RichCommandButton getCb12() {
        return cb12;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setCb13(RichCommandButton cb13) {
        this.cb13 = cb13;
    }

    public RichCommandButton getCb13() {
        return cb13;
    }

    public void setCb14(RichCommandButton cb14) {
        this.cb14 = cb14;
    }

    public RichCommandButton getCb14() {
        return cb14;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String login_action() {
        String u, p;
        u = it1.getValue().toString();
        p = it2.getValue().toString();
        ResultSet rs = null;
        ResultSet rs2 = null;
        int pno = 0;
        DbClass db = new DbClass();
        int ad = 0;
        int ff = 0;
        rs = db.exeSelect("SELECT * FROM USERS WHERE USERNAME='" + u + "' AND PASSWORD='" + p + "'");

        try {
            if (rs.next()) {

                ad = rs.getInt(3);
                it9.setValue("ad=" + ad);
                if (ad == 1)
                    ff = 1;
                else
                    ff = 2;
            } else
                ff = 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        if (ff == 1) {
            pb2.setVisible(true);
            pb3.setVisible(true);

        } else if (ff == 2) {
            rs2 = db.exeSelect("SELECT * FROM USERSPAGES WHERE USERNAME='" + u + "'");
            try {
                while (rs2.next()) {
                    pno = rs2.getInt(2);
                    if (pno == 1)
                        cb13.setDisabled(false);
                    else if (pno == 2)
                        cb14.setDisabled(false);

                }
            } catch (SQLException e)
            {
            }
            pb3.setVisible(true);

        }


        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;


    }

    public void setCb15(RichCommandButton cb15) {
        this.cb15 = cb15;
    }

    public RichCommandButton getCb15() {
        return cb15;
    }

    public void setCb16(RichCommandButton cb16) {
        this.cb16 = cb16;
    }

    public RichCommandButton getCb16() {
        return cb16;
    }

    public String cb15_action() {
        // Add event code here...

        pb2.setVisible(false);
        pb3.setVisible(false);

        return null;
    }

    public String cb16_action() {
        // Add event code here...
        pb3.setVisible(true);
        return null;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public String newLogin_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
}
