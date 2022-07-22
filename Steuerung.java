import java.text.DecimalFormat;
public class Steuerung {
  private Gui gui;
  private String calc="";
  String one ="";
  String two="";
  char operator ='?';
  float ergebnis =0;
  
  
  public Steuerung(Gui gui) {
    this.gui = gui;
  }
  
  public void button(char c){
    switch (c) {
      case'*': 
      case'/': 
      case'+':
      case'-':
        if(operator !='?'){
          showErgebnis();
        }
        if(one!=""){
          operator = c;
          showCalc(c);
        }
        break;
      case '=':
        showErgebnis();
        break;
      case 'r':
        reset();
        gui.setDisplay("0","0");
        break;
      default:
        if (operator == '?') {
          one +=c;
        } else {
          two +=c; 
        } // end of if-else
        showCalc(c);
    } // end of switch    
    
  } 
  
  public void showErgebnis(){
    ergebnis = rechne();
    reset();
    gui.setDisplay(new DecimalFormat("0.#").format(ergebnis) ,new DecimalFormat("0.#").format(ergebnis));
    one = ""+ergebnis;
    calc = ""+ergebnis; 
  }
  
  public void showCalc(char c){
    calc = calc+c;
    String zwischneergebnis = "= " +one;
    if(two!=""){
      zwischneergebnis = "= " +rechne();
    }
    gui.setDisplay(calc,zwischneergebnis);
  }
  
  public Float rechne(){
    switch (operator) {
      case  '+': 
        ergebnis= Float.parseFloat(one)+Float.parseFloat(two);
        break;
      case  '-': 
        ergebnis= Float.parseFloat(one)-Float.parseFloat(two);
        break;
      case  '*': 
        ergebnis= Float.parseFloat(one)*Float.parseFloat(two);
        break;
      case  '/': 
        ergebnis= Float.parseFloat(one)/Float.parseFloat(two);
        break;
      default: 
        break;
    } // end of switch
    return ergebnis;
  }
  public void reset(){
    calc = "";
    one ="";
    two ="";
    operator = '?';
  }
}