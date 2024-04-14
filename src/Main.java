import java.io.*;

public class Main {

    public static void main(String arr[]) throws Exception {
        // Define BufferedReader y variables
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        int opc=0;
        String ipc="";
        double x=0, y=0;
        Complejo A=null;//Objetos de la clase Complejo
        Complejo B=null;
        do {
            //Menu 
            System.out.println ("**************MENU*************** ");
            System.out.println ("*******BIENVENIDO********:Que desea hacer? ");
            System.out.println (" ");
            System.out.println ("1.- Ingreso del Numero Complejo ");
            System.out.println ("2.- Vizualizacion del Complejo");
            System.out.println ("3.- Forma Polar");
            System.out.println ("4.- Suma de Complejos");
            System.out.println ("5.- Resta de Complejos");
            System.out.println ("6.- Multiplicacion de Complejos");
            System.out.println ("7.- Division de Complejos");
            System.out.println ("8. Salir");
            System.out.println ("\n\nIngrese una opcion: ");
            //Lee desde teclado como String y transforma a entero
            //Comprueba que sea un entero valido
            ipc =teclado.readLine();
            try{
                opc=Integer.parseInt(ipc);
            }
            catch (Exception ex)
            {
                System.out.println("Excepcion detectada " + ex);
                System.out.println("Ingrese un numero valido ");
            }
            finally{

                switch (opc){
                    case 1:
                        double a,b;
                        Complejo C, D;
                        C=new Complejo();
                        D=new Complejo();
                        //Ingreso de numeros complejos
                        System.out.println ("Ingrese Complejo");
                        System.out.println("Ingrese la parte real de a: ");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese la parte imaginaria de b: ");
                        b=LeerDatos.leerReal();

                        A =new Complejo (a,b);


                        break;
                    case 2:


                        A.ver();
                        break;

                    case 3:
                        //Forma polar


                        double r1= A.modulo();
                        double a1= A.angulo();
                        System.out.println(r1+ ","+a1 + "grados");

                        break;

                    case 4:
                        // Suma de Complejos
                        System.out.println ("Ingrese Complejo");
                        System.out.println("Ingrese la parte real de a: ");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese la parte imaginaria de b:  ");
                        b=LeerDatos.leerReal();
                        B =new Complejo (a,b);

                        x=A.get_real()+B.get_real();
                        y=A.get_imag()+B.get_imag();
                        System.out.println ("El resultado de la suma es: ("+x+ "," +y+"i)");
                        break;
                    case 5:
                        //Resta de Complejos

                        System.out.println ("Ingrese Complejo");
                        System.out.println("Ingrese la parte real de a: ");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese la parte imaginaria de b:  ");
                        b=LeerDatos.leerReal();
                        B =new Complejo (a,b);

                        x=A.get_real()-B.get_real();
                        y=A.get_imag()-B.get_imag();
                        System.out.println ("El resultado de la resta es: ("+x+ "," +y+"i)");
                        break;
                    case 6:
                        //Multiplicación de Complejos
                        System.out.println ("Ingrese Complejo ");
                        System.out.println("Ingrese la parte real de a: ");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese la parte imaginaria de b:  ");
                        b=LeerDatos.leerReal();
                        B =new Complejo (a,b);

                        x=A.get_real()*B.get_real()-A.get_imag()*B.get_imag();
                        y=A.get_real()*B.get_imag()+A.get_imag()*B.get_real();
                        System.out.println ("El resultado es: ("+x+ "," +y+"i)");
                        break;

                    case 7:
                        //División de Complejos
                        System.out.println ("Ingrese Complejo ");
                        System.out.println("Ingrese la parte real de a: ");
                        a=LeerDatos.leerReal();
                        System.out.println("Ingrese la parte imaginaria de b:  ");
                        b=LeerDatos.leerReal();
                        B =new Complejo (a,b);

                        double aux;
                        if(B.modulo()==0.0){
                            System.out.println ("No se puede dividir");
                        }
                        else{
                            aux=B.get_real()*B.get_real()+B.get_imag()*B.get_imag();
                            x=(A.get_real()*B.get_real()+A.get_imag()*B.get_imag())/aux;
                            y=(A.get_imag()*B.get_real()-A.get_real()*B.get_imag())/aux;
                            System.out.println ("El resultado es: ("+x+ "," +y+"i)");
                        }

                    case 8:
                        break;
                    default:
                        //controla que solo ingrese opciones validas
                        System.out.println("ERROR INGRESA  BIEN!! LA OPCION!!!!!!!");
                        break;

                }
            }
        }while (opc!=8);
    }

}