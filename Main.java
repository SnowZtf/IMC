import java.util.*;

class Main {
  public static void main(String[] args) {
   
  Scanner entrada = new Scanner(System.in);
  
  double imc,peso,altura;
  
  System.out.println(" Informe seu peso: ");
  peso = entrada.nextDouble();
  System.out.println(" Informe sua altura: ");
  altura = entrada.nextDouble();
  
  imc = peso/Math.pow(altura,2);
  
  if(imc < 20){
  System.out.println(" Você está abaixo do peso");  
  }else
  if((imc >= 20) && (imc < 25)){                                        
  System.out.println(" Você tem o peso normal");                          }else        
  if((imc >= 25) && (imc < 30)){
  System.out.println(" Você está com sobre peso");
  }else
  if((imc >= 30) && (imc < 40)){
  System.out.println(" Você está obeso " );
  }else
  if(imc >= 40){
  System.out.println(" Você é um obeso mórbido ");
  }
  
  
  
  
  }
}