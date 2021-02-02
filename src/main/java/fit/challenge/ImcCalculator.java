package fit.challenge;

public class ImcCalculator {
  public static String calculate(double peso, double altura) {

    double alturaD = altura * altura;
    double imc = peso / alturaD;

    if(imc < 18.5){
      return "Magreza";
    }else if(imc < 24.9){
      return "Normal";
    }else if(imc < 30){
      return "Sobrepeso";
    }else{
      return "Obesidade";
    }
    
  }

}