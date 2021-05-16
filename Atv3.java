
package Atividades;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Double nota1, nota2, nota3, media;
        System.out.println("Entrez votre première note:");
        Scanner nt1=new Scanner(System.in);
        nota1=nt1.nextDouble();
        System.out.println("Entrez votre deuxième note:");
        Scanner nt2=new Scanner(System.in);
        nota2=nt2.nextDouble();
        System.out.println("Entrez votre troisième note:");
        Scanner nt3=new Scanner(System.in);
        nota3=nt3.nextDouble();
        media=(nota1+nota2+nota3)/3;
        if(media<5.0){
            System.out.println("Vous récupères la prochaine fois");
        }else if(media>=7){
            System.out.println("Vous avez été APPROUVÉ");
        }else if(media>=5.0 && media<7.0){
            System.out.println("Vous avez RÉCUPÉRES ");
        }    
    } 
}

