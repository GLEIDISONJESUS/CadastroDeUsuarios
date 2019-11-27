/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrodeusuarios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aluno09
 */
public class CadastroDeUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Usuario> Usuario = new ArrayList();

        System.out.println("===== Cadastro de Usuario =====");
        System.out.println("");

        for (int i = 0; i < 2; i++) {
            System.out.print("Digite seu email ");
            String email = sc.nextLine();
            System.out.print("Digite sua senha ");
            String senha = sc.nextLine();

            Usuario U = new Usuario();
            U.setEmail(email);
            U.setSenha(senha);

            Usuario.add(U);
        }

        System.out.println("===== Pesquisa Usuario ======");
        System.out.println("");
        System.out.println("Qual usuario deseja pesquisar? Digite um email ");
        String pesquisa = sc.nextLine();

        System.out.println("");
        System.out.println("===== Dados dos Usuario =====");
        System.out.println("");

        for (int i = 0; i < Usuario.size(); i++) {
            Usuario uTemp = Usuario.get(i);

                System.out.println("O email do usuario é " + uTemp.getEmail());
                
              if (pesquisa.equals(uTemp.getEmail())) {
                  
                
                System.out.println("Contem, é igual a " + pesquisa);
            }
            
           else{

                System.out.println("Usuario não existe");
              }

         

        }
    }

}
