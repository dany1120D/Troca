
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class acciones {
    public void escribir( ArrayList<Trocon> listaTrocas) throws IOException{
    FileWriter flwt=new FileWriter("TroconoesPerrones.txt");
    BufferedWriter bfwt=new BufferedWriter(flwt);
    for(Trocon troca: listaTrocas){
        bfwt.write(troca.getNombre()+" , "+ troca.getColor()+" , "+troca.getEstado()+"\n");
    }
        bfwt.close();
        flwt.close();
    }
}
