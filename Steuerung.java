import java.text.DecimalFormat;
import java.util.ArrayList;
public class Steuerung {
  private final Gui gui;
  private String calc="";

  private final ArrayList<Character> operators = new ArrayList<>();
  private final ArrayList<Double> numbers = new ArrayList<>() ;
  private String numberBuilder = "";



  public Steuerung(Gui gui) {
    this.gui = gui;
    operators.indexOf('x');
  }

  public void button(char c){
    switch (c) {
      case '*', '/', '+', '-' -> {
        if (numbers.size() <= operators.size()) {
          operators.add(c);
          numbers.add(Double.parseDouble(numberBuilder));
          numberBuilder = "";
          showCalc(c);
        }
      }
      case '=' -> {
        numbers.add(Double.parseDouble(numberBuilder));
        showErgebnis();
      }
      case 'r' -> {
        reset();
        gui.setDisplay("0", "0");
      }
      default -> {
        numberBuilder += c;
        showCalc(c);
      }
    }
  }

  public void showErgebnis(){
    Double ergebnis = rechne();
    reset();
    gui.setDisplay(null ,new DecimalFormat("0.#").format(ergebnis));
  }

  public void showCalc(char c){
    calc = calc+c;
    gui.setDisplay(calc, null);
  }

  public Double rechne(){
    while (operators.contains('/')) {
      int index = operators.indexOf('/');
      operators.remove(index);
      numbers.set(index+1, numbers.get(index)/numbers.get(index+1));
      numbers.remove(index);
    }
    while (operators.contains('*')) {
      int index = operators.indexOf('*');
      operators.remove(index);
      numbers.set(index+1, numbers.get(index)*numbers.get(index+1));
      numbers.remove(index);
    }
    while (operators.contains('+')) {
      int index = operators.indexOf('+');
      operators.remove(index);
       numbers.set(index+1, numbers.get(index)+numbers.get(index+1));
      numbers.remove(index);
    }
    while (operators.contains('-')) {
      int index = operators.indexOf('-');
      operators.remove(index);
      numbers.set(index+1, numbers.get(index)-numbers.get(index+1));
      numbers.remove(index);
    }
    return numbers.get(0);
  }
  public void reset(){
    operators.clear();
    numbers.clear();
    calc = "";
    numberBuilder ="";

  }
}