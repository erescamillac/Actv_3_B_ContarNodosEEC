/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eec.tests;

import org.eec.simplelinkedlisteec.LinkedListEEC;
/**
 *
 * @author erick
 */
public class ContarNodosTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListEEC list1, list2;
        int[] initValues1, initValues2;
        initValues1 = new int[]{6, 9, -25, 4, 567, 895};
        initValues2 = new int[]{590, 406, -102};
        
        list1 = new LinkedListEEC();
        list2 = new LinkedListEEC();
        
        System.out.println("##--Test de método contarNodos()--##");
        System.out.println("------------------------------------------------------");
        System.out.println("lista1 RECIÉN CREADA: " + list1);
        System.out.println("Núm. de nodos (lista1): " + list1.countNodes());
        System.out.println("lista1.legth : " + list1.getLength());
        System.out.println("------------------------------------------------------");
        System.out.println("lista2 RECIÉN CREADA: " + list2);
        System.out.println("Núm. de nodos (lista2): " + list2.countNodes());
        System.out.println("lista2.length: " + list2.getLength());
        
        for(int val : initValues1){
            list1.add(val);
        }
        
        for(int val : initValues2){
            list2.add(val);
        }
        
        System.out.println("##--DESPUÉS de haber agregado valores a las listas 1 y 2:");
        
        System.out.println("------------------------------------------------------");
        System.out.println("lista1 con VALORES: " + list1);
        System.out.println("Núm. de nodos (lista1): " + list1.countNodes());
        System.out.println("lista1.legth : " + list1.getLength());
        System.out.println("------------------------------------------------------");
        System.out.println("lista2 con VALORES: " + list2);
        System.out.println("Núm. de nodos (lista2): " + list2.countNodes());
        System.out.println("lista2.length: " + list2.getLength());
        
        System.out.println("##--Prueba de COUT después de haber eliminado algún elemento de cada lista.");
        
        System.out.println("Eliminando (-25) de la lista1...");
        list1.delete(-25);
        System.out.println("Eliminando (590) de la lista2...");
        list2.delete(590);
        System.out.println("--------------------------------------------------------");
        System.out.println("lista1 : " + list1);
        System.out.println("Núm. de nodos (lista1) : " + list1.countNodes());
        System.out.println("lista1.length : " + list1.getLength());
        System.out.println("--------------------------------------------------------");
        System.out.println("lista2 : " + list2);
        System.out.println("Núm. de nodos (lista2) : " + list2.countNodes());
        System.out.println("lista2.length : " + list2.getLength());
        
    } // fin de método main()
    
}
