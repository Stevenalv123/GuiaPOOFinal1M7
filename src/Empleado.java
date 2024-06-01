abstract class Empleado {//abstraccion: Es un molde para que las clases derivadas realizen implementaciones en el, es solo un modelo
    private String Nombre;//encapsulamiento
    private String NumeroIdentificacion;

    public Empleado(String nombre, String numeroIdentificacion){
        this.Nombre=nombre;
        this.NumeroIdentificacion=numeroIdentificacion;
    }

    public String getnombre(){
        return Nombre;
    }
    public void setNombre(String nombre){
        this.Nombre=nombre;
    }

    public String getnumeroIdentificacion(){
        return NumeroIdentificacion;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion){
        this.NumeroIdentificacion=numeroIdentificacion;
    }

    public abstract double calcularSalario();//no tiene cuerpo
}
