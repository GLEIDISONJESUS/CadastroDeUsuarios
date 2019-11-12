/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

/**
 *
 * @author Gleidson
 */
public class USUARIO {
    private String email;
    private String nome;
    
    void atribuirEmail(String parametro){
        email = parametro;
    }
    void atribuirNome(String parametro){
        nome = parametro;
    }
    void mostrarEmail(){
        System.out.println("O email é " + email);
    }
    void mostrarNome(){
        System.out.println("O nome é " + nome);
    }



}
