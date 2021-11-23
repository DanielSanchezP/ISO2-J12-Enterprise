/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISOJ12.Vacuna.dominio.controller;

import ISOJ12.Vacuna.persistencia.LoginDAO;
/**
 *
 * @author Daniel
 */
public class GestorLogin {
    
    public String[] login(String dni, String contrasena){
         LoginDAO log = new LoginDAO();
         return log.comprobarLogin(dni, contrasena);
    }
    
}
