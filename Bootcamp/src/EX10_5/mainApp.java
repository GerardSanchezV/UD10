package EX10_5;

import javax.swing.JOptionPane;
public class mainApp {
  
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce la cantidad de contrase�as deseadas:");
        int tamanio=Integer.parseInt(texto);
  
        texto=JOptionPane.showInputDialog("Introduce la longitud de la contrase�a:");
        int longitud=Integer.parseInt(texto);
        Contrase�a listaPassword[]=new Contrase�a[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Contrase�a(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContrase�a()+" "+fortalezaPassword[i]);
        }
    }
  
}