import java.io.*;
public class LeerDatos
{
    public static String leerCadena(){
        String l=null;
        BufferedReader lectori = new BufferedReader(new InputStreamReader(System.in));
        try{
            l=lectori.readLine();
        }catch(IOException s)
        {
            System.out.println(s.getMessage());
        }
        return l;
    }
    public static double leerReal(){
        //transforma de string a real

        return Double.parseDouble(leerCadena());
    }
    public static int leerEntero(){
        //transforma de string a entero
        return Integer.parseInt(leerCadena());
    }

}