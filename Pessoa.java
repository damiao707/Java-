
package projetoarray;
 
public class Pessoa {
    String nome;
    int idade;
    String email;
    float peso, altura, imc;

    float calculaIMC(float peso, float altura){
        float ximc=0;
        ximc = peso / (altura*altura);
        return (ximc);
    }
}
    

