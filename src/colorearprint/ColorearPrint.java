/*
    Para cambiar el color en la consola:
        System.out.println((char)27 + "[34;43mEjemplo de texto azul y fondo amarillo");

    Otros colores:
        30 black
        31 red
        32 green
        33 yellow
        34 blue
        35 magenta
        36 cyan
        37 white
        40 black background
        41 red background
        42 green background
        43 yellow background
        44 blue background
        45 magenta background
        46 cyan background
        47 white background
 */

package colorearprint;

/**
 *
 * @author francis
 */
public class ColorearPrint 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String texto = "Ejemplo de texto de color y con fondo";
        
        for(int i = 30; i <= 37; i++)
        {
            for(int j = 40; j <= 47; j++)
            {
                String textoformateado = "[";
                textoformateado += String.valueOf(i);
                textoformateado += ";";
                textoformateado += String.valueOf(j);
                textoformateado += "m";
                textoformateado += texto;
                System.out.println((char)27 + textoformateado);
            }
        }
        
        System.out.println("Texto con color normal");
    }
    
}
