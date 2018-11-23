
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class escribirBufferT {
    
}

class EscribiendoBuffer{
    public static void main(String[] args) throws IOException{
       // String [] troca1={"Ram","Azul","Perrona"};
       // String [] troca2={"Ford","Roja","mas o menos"};
       // String [] troca3={"Cheyenne","negra","chida"};
       
       /*List<Trocon> listaTrocas=Arrays.asList(
               new Trocon("Ram","Azul","Perrona"),
               new Trocon("Lobo","roja","Perrona"),
               new Trocon("Cheyyene","Azul","Perrona")
                                
               );*/
        
        ArrayList<Trocon> listaTrocas= new ArrayList();
        
        Trocon troca1=new Trocon("Ram","Azul","Perrona");
        listaTrocas.add(troca1);
        
        troca1=new Trocon("Ford","Morada","Mas o Menos");
        listaTrocas.add(troca1);
        
        troca1=new Trocon("Cheyenne","Negra","Chida");
        listaTrocas.add(troca1);
        
        acciones Atrokas=new acciones();
        Atrokas.escribir(listaTrocas);
        
        List<Trocon> listaleida= Atrokas.leerArchivo();
        listaleida.forEach(trocas -> System.out.println(trocas.getNombre()));
        
        
        
       
    
    }
    /*
    class acciones {
    public void escribir( ArrayList<Trocon> listaTrocas) throws IOException{
    FileWriter flwt=new FileWriter("TroconoesPerrones.txt");
    BufferedWriter bfwt=new BufferedWriter(flwt);
    for(Trocon troca: listaTrocas){
        bfwt.write(troca.getNombre()+" "+ troca.getColor()+" "+troca.getEstado());
    }
        bfwt.close();
        flwt.close();
    }
}*/
}

