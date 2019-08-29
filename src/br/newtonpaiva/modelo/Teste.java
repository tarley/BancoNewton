/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.modelo;

/**
 *
 * @author Tarley
 */
public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.registrar();
        
        p.setNome("Tarley Lana");
        
        String n = p.getNome();
        System.out.println(n); 
        
    }
}
