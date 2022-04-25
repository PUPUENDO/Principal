/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Alejandro
 */
class Motocicleta {

    /*
    public String marca, modelo;
    public int caja_de_cambios; //se redefinirá para considerar los tipos específicos
    public int cilindraje, potencia;
    public double precio;
    public String color; //se redefinirá para considerar los colores específicos
    public boolean encendida, luz_delantera, luz_trasera;
    private Direccionales direccionales;
     */
    private boolean prende, luz_delantera, luz_trasera;
    private boolean movimiento;
    private double kilometraje;
    private Caja_de_cambios caja_de_cambios;
    private Direccionales direccionales;
    private double velocidad;
    private String marca, modelo;
    private int cilindraje;

    public Motocicleta() {
        /*
        this.marca = "Null";
        this.modelo = "Null";
        this.caja_de_cambios = 0;
        this.cilindraje = 0;
        this.potencia = 0;
        this.precio = 0.00;
        this.color = "Null";
        this.encendida = false;
        this.luz_delantera = false;
        this.luz_trasera = false;
         */
        this.velocidad = 0.0;
        this.direccionales = Direccionales.APAGADAS;
        this.kilometraje = 0;
        this.luz_delantera = false;
        this.luz_trasera = false;
        this.prende = false;
        this.movimiento = false;
        this.caja_de_cambios = Caja_de_cambios.NEUTRAL;
        this.marca = "Honda";
        this.modelo = "CRF450L";
        this.cilindraje = 250;
    }

    /*
    public String getDireccionales() {
        if (this.direccionales == Direccionales.APAGADAS) {
            return "apagadas";
        } else if (this.direccionales == Direccionales.IZQUIERDA) {
            return "a la izquierda";
        } else if (this.direccionales == Direccionales.DERECHA) {
            return "a la derecha";
        } else {
            return "intermitentes";
        }
    }

    /*
    public int getDireccionalaes() {
        if (this.direccionales == Direccionales.APAGADAS) {
            return "apagadas";
        } else if (this.direccionales == Direccionales.IZQUIERDA) {
            return "a la izquierda";
        } else if (this.direccionales == Direccionales.DERECHA) {
            return "a la derecha";
        } else {
            return "intermitentes";
        }
    }
    
    
    
    public void setDireccionales(int direccionales) {
        if (direccionales == 0) {
            this.direccionales = Direccionales.APAGADAS;
        } else if (direccionales == 1) {
            this.direccionales = Direccionales.IZQUIERDA;
        } else if (direccionales == 2) {
            this.direccionales = Direccionales.DERECHA;
        }
    }
     */

 /*
    public Motocicleta(String marca, String modelo, int caja_de_cambios, 
            int cilindraje, int potencia, double precio, String color, boolean encendida,
            boolean luz_delantera, boolean luz_trasera){
    
        this.marca = marca;
        this.modelo = modelo;
        this.caja_de_cambios = caja_de_cambios;
        this.cilindraje = cilindraje;
        this.potencia = potencia;
        this.precio = precio;
        this.color = color;
        this.encendida = encendida;
        this.luz_delantera = luz_delantera;
        this.luz_trasera = luz_trasera;
    }
     */
 /*
    public double kilometraje;
    public int direccionales;
    public double velocidad;
    public long time_milis;
    
    public void acelerar(){
        long segundos, nuevo_time_milis = System.currentTimeMillis();
        
        velocidad += 5;
        if(nuevo_time_milis - time_milis != 0)
            segundos = (nuevo_time_milis - time_milis) / 1000;
        else
            segundos = 1;
        kilometraje += velocidad / segundos;
        time_milis = System.currentTimeMillis(); 
        System.out.println("La velocidad de la moto es " + velocidad);
        System.out.println("El kilometraje de la moto es " + kilometraje);
    }
     */
    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public double getVelocidad() {
        return velocidad;
    }

    /*
    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }
     */
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isMovimiento() {
        return movimiento;
    }

    public String estadoMovimiento() {
        return this.movimiento ? "en movimiento" : "detenida";
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
        if (!this.prende) //this.prende != true
        {
            this.movimiento = false;
        }
    }

    public String getCaja_de_cambios() {
        return caja_de_cambios.getEstado();
    }

    public void setCaja_de_cambios(int caja_de_cambios) {
        if (caja_de_cambios < Caja_de_cambios.values().length) {
            for (Caja_de_cambios d : Caja_de_cambios.values()) {
                if (caja_de_cambios == d.ordinal()) {
                    this.caja_de_cambios = d;
                }
            }
        } else {
            this.caja_de_cambios = Caja_de_cambios.NEUTRAL;
        }
    }

    public void setCaja_de_cambios(Caja_de_cambios caja_de_cambios) {
        this.caja_de_cambios = caja_de_cambios;
    }

    public String getDireccionales() {
        return direccionales.getEstado();
    }

    public void setDireccionales(int direccionales) {
        if (direccionales < Direccionales.values().length) {
            for (Direccionales d : Direccionales.values()) {
                if (direccionales == d.ordinal()) {
                    this.direccionales = d;
                }
            }
        } else {
            this.direccionales = Direccionales.APAGADAS;
        }
    }

    public void setDireccionales(Direccionales direccionales) {
        this.direccionales = direccionales;
    }

    public boolean isCochePrendido() {
        return prende;
    }

    public String estadoCoche() {
        return (this.prende ? "encendida" : "apagada");
    }

    public boolean isLuzDelanteraEncendida() {
        return luz_delantera;
    }

    public String estadoLuzDelantera() {
        return (this.luz_delantera ? "encendida" : "apagada");
    }

    public boolean isLuzTraseraEncendida() {
        return luz_trasera;
    }

    public String estadoLuzTrasera() {
        return (this.luz_trasera ? "encendida" : "apagada");
    }

    /*    
    public void setPrendeCoche(boolean prende) {
        this.prende = prende;
    }
     */
    public void enciendeMotocicleta() {
        this.prende = true;
    }

    public void apagaMotocicleta() {
        this.prende = false;
    }

    public void cambiaEstadoMotocicleta() {
        this.prende = !this.prende;
    }

    /*
    /**
     * Solo Dios y yo sabíamos para qué servía esta cosa, ahora, solo Dios lo sabe
     * @param delantera true para delantera, false para trasera
     * @param luz true para encendida, false para apagada
     *//*
    public void setLuz(boolean delantera, boolean luz) {
        if(delantera)
            this.luz_delantera = luz;
        else
            this.luz_trasera = luz;
    }

    public void setLuz_delantera(boolean luz_delantera) {
        this.luz_delantera = luz_delantera;
    }
     */
    //probar implementación con switch ... case
    public void enciendeLuzDelantera() {
        this.luz_delantera = true;
    }

    public void apagaLuzDelantera() {
        this.luz_delantera = false;
    }

    public void cambiaEstadoLuzDelantera() {
        this.luz_delantera = !this.luz_delantera;
    }

    /*
    public void setLuz_trasera(boolean luz_trasera) {
        this.luz_trasera = luz_trasera;
    }
     */
    public void enciendeLuzTrasera() {
        this.luz_trasera = true;
    }

    public void apagaLuzTrasera() {
        this.luz_trasera = false;
    }

    public void cambiaEstadoLuzTrasera() {
        this.luz_trasera = !this.luz_trasera;
    }

    //Otros métodos
    public String acelerar() {
        if (this.prende) {
            this.movimiento = true;
            this.velocidad = 5;
            this.kilometraje += this.velocidad; //Aceleración instantánea de 1 segundo
            return "";
        } else {
            return "No puede acelerar, la motocicleta está apagada";
        }
    }

    public String acelerar(double segundos) {
        if (this.prende && segundos > 0) {
            this.movimiento = true;
            this.velocidad = 5;
            this.kilometraje += this.velocidad * segundos;// v=d/t d = vt acumulador  
            return "";
        } else {
            return "No puede acelerar, la motocicleta está apagada";
        }
    }

    public String acelerar(double metros_seg, double segundos) {
        if (this.prende && metros_seg > 0 && segundos > 0) {
            this.movimiento = true;
            this.velocidad = metros_seg;
            this.kilometraje += this.velocidad * segundos;// v=d/t d = vt acumulador  
            return "";
        } else {
            return "No puede acelerar, la motocicleta está apagada";
        }
    }

    //toString
    @Override
    public String toString() {
        return "La motocicleta es de la marca " + this.getMarca()
                + "\nLa motocicleta es del modelo " + this.getModelo()
                + "\nLa motocicleta tiene un cilindraje de " + this.getCilindraje()
                + "\nLa motocicleta está " + this.estadoCoche()
                + "\nLa motocicleta está " + this.estadoMovimiento()
                + "\nEl kilometraje es " + this.kilometraje + " m"
                + "\nLa velocidad es " + this.velocidad + " m/s"
                + "\nLa luz delantera está " + this.estadoLuzDelantera()
                + "\nLa luz trasera está " + this.estadoLuzTrasera()
                + "\nLas direccionales están " + this.getDireccionales()
                + "\nLa marcha está en " + this.getCaja_de_cambios();
    }
}
