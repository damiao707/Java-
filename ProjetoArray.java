package projetoarray;
public class ProjetoArray {
 
    public static void main(String[] args) {
 
        System.out.println("\n======Calculando IMC======");
 
        //Cria o array que pode armazenar 4 pessoas:
        Pessoa listaPessoas[] = new Pessoa[4];
 
        //Pessoa 1
        listaPessoas[0] = new Pessoa(); //É preciso inicializar
        listaPessoas[0].nome = " Milenne ";
        listaPessoas[0].idade = 41;
        listaPessoas[0].email = "Milenne@uninove.edu.br";
        listaPessoas[0].peso = 30.6f;
        listaPessoas[0].altura = 1.48f;
        listaPessoas[0].imc = listaPessoas[0].calculaIMC(listaPessoas[0].peso, listaPessoas[0].altura);
 
        //Pessoa 2
        listaPessoas[1] = new Pessoa();
 
        listaPessoas[1].nome = "Junior lustosa";
        listaPessoas[1].idade = 20;
        listaPessoas[1].email = "Junior lustosa ";
        listaPessoas[1].peso = 26.0f;
        listaPessoas[1].altura = 1.28f;
        listaPessoas[1].imc = listaPessoas[1].calculaIMC(listaPessoas[1].peso, listaPessoas[1].altura);
 
        //Pessoa 3
        listaPessoas[2] = new Pessoa();
 
        listaPessoas[2].nome = "Chapolin";
        listaPessoas[2].idade = 90;
        listaPessoas[2].email = "chapolin909@uninove.edu.br";
        listaPessoas[2].peso = 55.0f;
        listaPessoas[2].altura = 1.60f;
        listaPessoas[2].imc = listaPessoas[2].calculaIMC(listaPessoas[2].peso, listaPessoas[2].altura);
 
 
        //Pessoa 4
        listaPessoas[3] = new Pessoa();
 
        listaPessoas[3].nome = "Pepa ";
        listaPessoas[3].idade = 35;
        listaPessoas[3].email = "pepa@uninove.edu.br";
        listaPessoas[3].peso = 100.0f;
        listaPessoas[3].altura = 1.90f;
        listaPessoas[3].imc = listaPessoas[3].calculaIMC(listaPessoas[3].peso, listaPessoas[3].altura);
 
 
       int i = 0;
        while (i <= 3) {
            System.out.println("Dados da pessoa " + (i + 1) + ":"); //i + 1 para deixar mais amigáve a exibição
            System.out.println("\t" + listaPessoas[i].nome);
            System.out.println("\t" + listaPessoas[i].idade);
            System.out.println("\t" + listaPessoas[i].email);
            System.out.println("\t" + listaPessoas[i].altura);
            System.out.println("\t" + listaPessoas[i].peso);
            System.out.println("\t" + listaPessoas[i].imc);
 
            i++; 
        }
    }
 
}