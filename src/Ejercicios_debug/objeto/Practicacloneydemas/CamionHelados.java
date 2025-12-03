package Ejercicios_debug.objeto.Practicacloneydemas;

public class CamionHelados {

    protected String modelo = null;
    protected int helados;
    protected int kilometros;
    protected int consumidoresFelices;

    public CamionHelados(String modelo, int kilometros) {
        this.modelo = modelo;
        this.helados = 50;
        this.kilometros = kilometros;
        this.consumidoresFelices = 0;
    }

    public String getinfo() {
        return String.format("""
                Modelo: %s
                Helados: %d
                Kilometros: %d
                consumidores Felices; %d
                """, modelo, helados, kilometros, consumidoresFelices);
    }
    public void atenderpersonas(int personas){
        this.kilometros =+ 50;
        this.helados =+ personas;
        this.consumidoresFelices =+ personas;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", kilometros: " + kilometros;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CamionHelados otroCamion = (CamionHelados) obj;
        return kilometros == otroCamion.kilometros && modelo.equals(otroCamion.modelo);
    }
    @Override
    protected Object clone() {
        return new CamionHelados(this.modelo,this.kilometros);
    }
}
