import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    //exercicio 1
    //String planeta = "plutao";
    //System.out.println(planeta);

    //exercicio 2
    //System.out.println("QUal seu nome?");
    //Scanner pergunta1 = new Scanner(System.in);
    //String nome = pergunta1.nextLine();
    //System.out.println("Ola " +nome);

    /*exercicio 3
    System.out.println("QUal seu nome?");
    Scanner pergunta1 = new Scanner(System.in);
    String nome = pergunta1.nextLine();

    System.out.println("QUal seu idade?");
    Scanner pergunta2 = new Scanner(System.in);
    int idade = pergunta2.nextInt();
    
    System.out.println("Ola " +nome + " sua idade é: " +idade ); */

    /*exercicio 4 Formas Geometricas
    //Retangulo
    Scanner in = new Scanner(System.in);
    System.out.println("qual a base?");
    int base = in.nextInt();

    Scanner pergunta2 = new Scanner(System.in);
    System.out.println("Qual a altura?");
    int altura = in.nextInt();

    System.out.println("a area é: " +base * altura); */

    /* Quadrado
    Scanner in = new Scanner(System.in);
    System.out.println("qual o lado?");
    int lado1 = in.nextInt();

    Scanner pergunta2 = new Scanner(System.in);
    System.out.println("Qual o lado 2?");
    int lado2 = in.nextInt();

    System.out.println("a area é: " + (lado1 * lado2) * 4); */
    

    /*
    //Losango
    Scanner in = new Scanner(System.in);
    System.out.println("qual a base maior?");
    int base_maior = in.nextInt();

    System.out.println("qual a base menor?");
    int base_menor = in.nextInt();

    System.out.println("qual a altura?");
    int altura = in.nextInt();

    System.out.println("o valor da area é:" + ((base_maior + base_menor)*altura)/2); */

    //Trapezio
    /*
    Scanner in = new Scanner(System.in);
    System.out.println("qual a base maior?");
    int base_maior = in.nextInt();

    System.out.println("qual a base menor?");
    int base_menor = in.nextInt();

    System.out.println("qual a altura?");
    int altura = in.nextInt();

    System.out.println("o valor da area é:" + ((base_maior + base_menor)*altura)/2); */

    //Paralelograma
    /*
    Scanner in = new Scanner(System.in);
    System.out.println("qual a base?");
    int base = in.nextInt();

    System.out.println("qual a altura?");
    int altura = in.nextInt();

    System.out.println("o valor da area é:" + base*altura );
    */

    //Triangulo
    /*
    Scanner in = new Scanner(System.in);
    System.out.println("qual a base?");
    int base = in.nextInt();

    System.out.println("qual a altura?");
    int altura = in.nextInt();

    System.out.println("o valor da area é:" + (base *altura)/2);
    */

    //Circulo
    /*
    Scanner in = new Scanner(System.in);
    System.out.println("valor do raio?");
    int raio = in.nextInt();

     System.out.println("o valor da circulo é:" + raio * 3.14);
      */
    
    /*exercicio 5
    System.out.println("escrva um valor");
    Scanner scan = new Scanner(System.in);
    int numero_usuario = scan.nextInt();

    if(numero_usuario < 0){
       System.out.println("valor negativo");
      
    }else if(numero_usuario == 0){
       System.out.println("neutro");
    }else{
       System.out.println("valor positvo");
    }*/

    /*exercicio 6
    System.out.println("escrva o primeiro valor");
    Scanner scan = new Scanner(System.in);
    int valor1 = scan.nextInt();

    System.out.println("escrva o segundo valor");
    int valor2 = scan.nextInt();

    System.out.println("escrva o terceiro valor");
    int valor3 = scan.nextInt();

    int resultado = Math.max(valor1, Math.max(valor2, valor3));

    System.out.println("O maior é: " +resultado); */

    /*exercicio 7 
    System.out.println("escrva o primeiro valor");
    Scanner scan = new Scanner(System.in);
    int valor1 = scan.nextInt();

    System.out.println("escrva o segundo valor");
    int valor2 = scan.nextInt();

    System.out.println("escrva o terceiro valor");
    int valor3 = scan.nextInt();

    if(valor1 < valor2 && valor1 < valor3){
      System.out.println("a soma é " + (valor2 + valor3));
    }else if(valor2 < valor3 && valor2 < valor1){
      System.out.println("a soma é " + (valor3 + valor1));
    }else{
      System.out.println("a soma é " + (valor2 + valor1));
    } */

     /*exercicio 8
    
    System.out.println("escrva o primeiro valor");
    Scanner scan = new Scanner(System.in);
    int valor1 = scan.nextInt();

    System.out.println("escrva o segundo valor");
    int valor2 = scan.nextInt(); 


    if(valor2 <= 0){
    System.out.println("escreva um valor maior que 0");
    }else{
      System.out.println("a divisao é: " + valor1 / valor2);
    } */

    /*exercicio 9
    System.out.println("escreva a nota 1");
    Scanner scan = new Scanner(System.in);
    int valor1 = scan.nextInt();

    System.out.println("escreva a nota 2");
    int valor2 = scan.nextInt();

    System.out.println("escreva a nota 3");
    int valor3 = scan.nextInt();

    System.out.println("escreva a nota 4");
    int valor4 = scan.nextInt();

    System.out.println("escreva a nota 5");
    int valor5 = scan.nextInt();

    System.out.println("escreva a nota 6");
    int valor6 = scan.nextInt();

    System.out.println("escreva a nota 7");
    int valor7 = scan.nextInt();

    System.out.println("escreva a nota 8");
    int valor8 = scan.nextInt();

    System.out.println("escreva a nota 9");
    int valor9 = scan.nextInt();

    System.out.println("escreva a nota 10");
    int valor10 = scan.nextInt();

    int resultado = (valor1+valor2+valor3+valor4+valor5+valor6+valor7+valor8+valor9+valor10)
/ 6;

    System.out.println("a media é: " +resultado); */
    
    /*exercicio 10
    System.out.println("escreva a primeira nota");
    Scanner scan = new Scanner(System.in);
    int valor1 = scan.nextInt();

    System.out.println("escreva a segunda nota");
    int valor2 = scan.nextInt();

    System.out.println("escreva a terceira nota");
    int valor3 = scan.nextInt();

    System.out.println("escreva a quarta nota");
    int valor4 = scan.nextInt();

    if((valor1 + valor2 + valor3 + valor4) /4 >= 6){
      System.out.println("Parabens vc foi aprovado");
    }else if((valor1 + valor2 + valor3 + valor4) /4 < 6){
      System.out.println("OPS vc foi reprovado");
    } */

    /*exercicio 11
     int contagem = 30;
        while(contagem != -1 ){
            if(contagem != -1){
            System.out.println(contagem);
            contagem--;
        } if(contagem == 0){
            System.out.println("Explosao");
            contagem--;
        }
    } */
    
    /*exercicio 12
    int contador = 10;

    while(contador != 0){
      System.out.println(contador);
      contador--;
    } */

    //exercicio 13
    

    /*exercicio 14 - Esta incompleto não consegui finalizar
    System.out.println("escreva a nota 1");
    Scanner scan = new Scanner(System.in);
    int valor1 = scan.nextInt();

    System.out.println("escreva a nota 2");
    int valor2 = scan.nextInt();
    int media = (valor1 + valor2) / 2;
    if(media >= 6.5){
    System.out.println("Aprovado");
    }else{
    System.out.println("REPROVADO");
    }

    String escolha = (System.out.println("Calcular a média de outro aluno? Sim(s) / Não(s)"))
while(escolha == "S"){ */
  

    

    
    

    
    
  }
}