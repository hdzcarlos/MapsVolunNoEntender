package com.cice.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mierda {
	
	public void logica () {
	Map<String, String> mapDeStrings = new HashMap<>();
	mapDeStrings.put("item1", "4394ddddddd");
	mapDeStrings.put("item2","ooooooo234");
	mapDeStrings.put("clave1", "pepeNoPodiaFaltar2345");

	List<String> listaDeStrings = new ArrayList<>();
	listaDeStrings.add("wq32453js23");
	listaDeStrings.add("SDJRD2332");
	listaDeStrings.add("234324234rt,,,,3");
	listaDeStrings.add("23nhdfe098sdf23");
	listaDeStrings.addAll(0, mapDeStrings.values());
	
	for (String string : listaDeStrings) {
		System.out.println(string);
	}
	}
	// Codigo de StackoverFlow
	
	
//	String s="";  //Esto es una variable global donde se va a almacenar el resultado
//	public void comprobar(String aux){
//	    if (aux.contains("Free"))
//	    {
//	        int posF = aux.indexOf("Free");
//	        comprobar(aux.substring(0,posF));
//	        s = s + "Free";
//	        comprobar(aux.substring(posF+4, aux.length()-1));
//	    }else{
//	        compruebaResto(aux);
//	    }
//	}
//
//	public void compruebaResto(String aux){
//	    char[] cs = aux.toCharArray();
//
//	    for (char c:cs) {  //Recorremos la cadena
//	        if (c!=',')    //Si no es una coma comprobamos si es un número
//	        {
//	            try{
//	                Integer.parseInt(c+"");  //Si no es un número pasara al cath y no concatenará el valor
//	                s=s+c;
//	            }catch(Exception e)
//	            {}
//	        }else{
//	            s = s + c;  //Si es un punto lo aceptamos
//	        }
//	    }
//	}

}
