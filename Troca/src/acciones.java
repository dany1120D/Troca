
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    public List<Trocon> leerArchivo() throws FileNotFoundException{
        List<Trocon> listaTrocas=new ArrayList<>();
        File archivo=new File("TroconoesPerrones.txt");       
        Scanner scanner=new Scanner(archivo);
        while(scanner.hasNextLine()){
            String linea = scanner.nextLine();
            Scanner delimitar = new Scanner(linea);
            delimitar.useDelimiter("\\s*,\\s*");
            Trocon trocas=new Trocon();
            trocas.setNombre(delimitar.next());
            trocas.setColor(delimitar.next());
            trocas.setEstado(delimitar.next());
            
            listaTrocas.add(trocas);       
            
                    
        }
        return listaTrocas;
    }
}
