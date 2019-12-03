/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal_java;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author lucas
 */

class lavacao {
    
    public static lavacao cadastrar(){
        Scanner teclado =  new Scanner(System.in);
       
        
        lavacao cad = new lavacao();
        
        try {
            FileWriter arquivo = new FileWriter("lista.txt",true);
            PrintWriter print = new PrintWriter(arquivo,true);
            
                System.out.println("Insirir um cliente :");
                print.println( cad.nomecliente=teclado.next());
                System.out.println("Digite a marca do carro : ");
                print.println(cad.marca=teclado.next());
                System.out.println("Digite a placa do carro :");
                print.println(cad.placa=teclado.next());
                System.out.println("Digite a cor do carro :");
                print.println(cad.cor=teclado.next());
                System.out.println("Digite o telefone  :");
                print.println(cad.telefone=teclado.nextInt());         
             

            print.close();
            arquivo.close();
            
        } catch (Exception ex) {
            System.out.println("Erro!");
        }
         return cad;        
    
}
            String nomecliente;
            String marca;
            String placa;
            String cor;
            int telefone;
            lavacao proximo;
    
}

public class TrabalhoFinal_java {    
    
        lavacao ini = null;
        
        public void inserir(lavacao novo){
            if(ini == null){
                
                ini = novo;
            } else {
                lavacao aux = ini;
                while(aux.proximo != null){
                    aux = aux.proximo;
                }
                aux.proximo = novo;
            }
            
        }
        
        public void retirar(){
        
         File arquivo =  new File("lista.txt");
        
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linhas = br.readLine();
            ArrayList<String> salvar = new ArrayList();
            while(linhas != null){
                
                if(linhas.equals("lucas") == false ){
                    salvar.add(linhas);
                }
                linhas = br.readLine();
            }
            br.close();
            fr.close();
            FileWriter fw2 = new FileWriter(arquivo, true);
            fw2.close();
            
            
            FileWriter fw =  new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0;i<salvar.size(); i++){
                bw.write(salvar.get(i) );
                bw.newLine();
            
        }
            bw.close();
            fw.close();
            
            
        } catch (Exception ex) {
            
            System.err.println("Erro");
        }
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linhas = br.readLine();
            ArrayList<String> salvar = new ArrayList();
            while(linhas != null){
                
                if(linhas.equals("lucas") == false ){
                    salvar.add(linhas);
                }
                linhas = br.readLine();
            }
            br.close();
            fr.close();
            FileWriter fw2 = new FileWriter(arquivo, true);
            fw2.close();
            
            
            FileWriter fw =  new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0;i<salvar.size(); i++){
                bw.write(salvar.get(i) );
                bw.newLine();
            
        }
            bw.close();
            fw.close();
            
            
        } catch (Exception ex) {
            
            System.err.println("Erro");
        }
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linhas = br.readLine();
            ArrayList<String> salvar = new ArrayList();
            while(linhas != null){
                
                if(linhas.equals("lucas") == false ){
                    salvar.add(linhas);
                }
                linhas = br.readLine();
            }
            br.close();
            fr.close();
            FileWriter fw2 = new FileWriter(arquivo, true);
            fw2.close();
            
            
            FileWriter fw =  new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0;i<salvar.size(); i++){
                bw.write(salvar.get(i) );
                bw.newLine();
            
        }
            bw.close();
            fw.close();
            
            
        } catch (Exception ex) {
            
            System.err.println("Erro");
        }
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            String linhas = br.readLine();
            ArrayList<String> salvar = new ArrayList();
            while(linhas != null){
                
                if(linhas.equals("lucas") == false ){
                    salvar.add(linhas);
                }
                linhas = br.readLine();
            }
            br.close();
            fr.close();
            FileWriter fw2 = new FileWriter(arquivo, true);
            fw2.close();
            
            
            FileWriter fw =  new FileWriter(arquivo);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0;i<salvar.size(); i++){
                bw.write(salvar.get(i) );
                bw.newLine();
            
        }
            bw.close();
            fw.close();
            
            
        } catch (Exception ex) {
            
            System.err.println("Erro");
        }
                       
            
            
        }
        public void chamarProximo(){
          
           
            if(ini == null){
                System.out.println("A lista esta vazia");
            }else{
                System.out.println("O proximo é "+ " "+ini.nomecliente+" "+" "+ini.marca+" "+ini.placa+" "+ini.telefone+" ." );
                ini = ini.proximo;
            }
            //FileWriter fw = new FileWriter(arquivo);
            
            
            
            
        }
        
        public void listar(){
           lavacao aux = ini;
           if(aux == null){
               System.out.println("A fila esta vazia");
           }else{
               aux = ini;
           }
           while (aux != null){
               System.out.println("O nome é "+ aux.nomecliente+" "+" e a placa é: "+ aux.placa);
               aux = aux.proximo;
           }
        }                   
        

    public static void main(String[] args) throws IOException{
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        TrabalhoFinal_java chama = new TrabalhoFinal_java();
        lavacao cad = new lavacao();
        do {            
            System.out.println("Bem vindo ao lava car do lucas !!");
            System.out.println("Digite as opções:  ");
            System.out.println("1 - Inserir na fila !");
            System.out.println("2 - Chamar o proximo da fila !");
            System.out.println("3 - Mostrar todos da fila !");
            System.out.println("4 - Sair do sistemas");
            opcao = teclado.nextInt();
            if(opcao == 1 ){
                cad = lavacao.cadastrar();
                chama.inserir(cad);
            }
            if(opcao == 2 ){
                //chama.chamarProximo();
                
                chama.retirar();
                
            }
            if(opcao == 3 ){
                chama.listar();
            }
        } while (opcao < 4);
       
          
        
        
        
    }
    
}
