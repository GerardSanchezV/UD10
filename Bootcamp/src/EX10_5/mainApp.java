package EX10_5;

import javax.swing.JOptionPane;
public class mainApp {
  
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce la cantidad de contraseñas deseadas:");
        int tamanio=Integer.parseInt(texto);
  
        texto=JOptionPane.showInputDialog("Introduce la longitud de la contraseña:");
        int longitud=Integer.parseInt(texto);
        Contraseña listaPassword[]=new Contraseña[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Contraseña(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
        }
    }
  
}