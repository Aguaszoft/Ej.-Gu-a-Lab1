public class Complejo{
    double real;
    double imag;
    public Complejo(double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    public Complejo(){
        real=0.0;
        imag=0.0;
    }
    //Para visualizar
    public void ver(){
        if(imag>0)
            System.out.println("("+ real+" + "+ imag+"i)");
        else
            System.out.println("("+ real+ imag+"i)");
    }
    public double get_real(){
        return real;
    }
    public double get_imag(){
        return imag;
    }
    public void set_real(double real){
        this.real=real;
    }
    public void set_imag(double imag){
        this.imag=imag;
    }
    public double modulo(){
        return Math.sqrt(real*real+imag*imag);
    }
    public String toString(){
        if(imag>0)
            return new String((double)Math.round(100*real)/100+" + "+(double)Math.round(100*imag)/100+"*i");
        return new String((double)Math.round(100*real)/100+" - "+(double)Math.round(-100*imag)/100+"*i");
    }

    public double angulo(){
        double angulo=Math.atan2(imag, real);
        if(angulo<0)  angulo=2*Math.PI+angulo;
        return angulo*180/Math.PI;
    }

}
