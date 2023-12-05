package ba.unsa.etf.rpr.tutorijal06;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
public class Controller {
    public Label display;
    private Boolean tacka=false;
    private SimpleStringProperty prviParametar=new SimpleStringProperty("");
    private Double prviBroj=0.0;
    private Double drugiBroj=0.0;
    private String operacija=null;
    private boolean poslijeJednako=false;
    public SimpleStringProperty prviParametarProperty(){
        return prviParametar;
    }
    public String getPrviParametar(){
        return prviParametar.get();
    }
    private void postaviPrviParametar(String vrijednost){
        if(poslijeJednako){
            prviParametar.set("");
            poslijeJednako=false;
        }
        prviParametar.set(prviParametar.get()+vrijednost);
    }
    public void textClick(ActionEvent actionEvent) {
    }
    public void buttonClickZero(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(0));
    }
    public void buttonClickOne(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(1));
    }
    public void buttonClickTwo(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(2));
    }
    public void buttonClickThree(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(3));
    }
    public void buttonClickFour(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(4));
    }
    public void buttonClickFive(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(5));
    }
    public void buttonClickSix(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(6));
    }
    public void buttonClickSeven(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(7));
    }
    public void buttonClickEight(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(8));
    }
    public void buttonClickNine(ActionEvent actionEvent) {
        postaviPrviParametar(String.valueOf(9));
    }
    public void buttonClickP(ActionEvent actionEvent) {
        if(!tacka && prviParametar.toString().isEmpty()) {
            postaviPrviParametar("0.");
        }else if(!tacka){
            postaviPrviParametar(".");
        }tacka=true;
    }
    public void buttonClickEquals(ActionEvent actionEvent) {
        postaviDrugiBroj();
        System.out.println("prviBroj: "+prviBroj+", drugiBroj: "+drugiBroj+", operacija: "+operacija);
        switch(operacija) {
            case "add":
                prviParametar.set((prviBroj+drugiBroj)+"");
                break;
            case "sub":
                prviParametar.set((prviBroj-drugiBroj)+"");
                break;
            case "mul":
                prviParametar.set((prviBroj*drugiBroj)+"");
                break;
            case "div":
                prviParametar.set((prviBroj/drugiBroj)+"");
                break;
            case "mod":
                prviParametar.set((prviBroj%drugiBroj)+"");
                break;
            default:
                // code block
        } //prviBroj=Double.parseDouble(prviParametar.get()); drugiBroj=0.0;
          prviBroj=0.0;
          operacija=null; poslijeJednako=true; tacka=false;
        //System.out.println("prviBroj: "+prviBroj+", drugiBroj: "+drugiBroj+", operacija: "+operacija);

       // prviParametar=null;
    }
    public void postaviPrviBroj(){
        if(prviParametar.get().isEmpty()){
            prviBroj=0.0;
        }else{
            prviBroj = Double.parseDouble(prviParametar.get());
        }
        prviParametar.set(""); tacka=false;
    }
    public void postaviDrugiBroj(){
        drugiBroj=Double.parseDouble(prviParametar.get());
        prviParametar.set("");
    }
    public void buttonClickPlus(ActionEvent actionEvent) {
        operacija="add"; postaviPrviBroj();
    }
    public void buttonClickMinus(ActionEvent actionEvent) {
        operacija="sub"; postaviPrviBroj();
    }
    public void buttonClickMod(ActionEvent actionEvent) {
        operacija="mod"; postaviPrviBroj();
    }
    public void buttonClickMul(ActionEvent actionEvent) {
        operacija="mul"; postaviPrviBroj();
    }
    public void buttonClickDiv(ActionEvent actionEvent) {
        operacija="div"; postaviPrviBroj();
    }
}
