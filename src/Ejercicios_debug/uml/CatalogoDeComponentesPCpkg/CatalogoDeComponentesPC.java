package Ejercicios_debug.uml.CatalogoDeComponentesPCpkg;

public class CatalogoDeComponentesPC {

    public class Ordenador {
        private final String nombre;


        public Ordenador(String nombre, PlacaBase placaBase , Procesador procesador ,MemoriaRAM memoriaRAM) {
            this.nombre = nombre;
        }
        public void infoplaca(PlacaBase placaBase){
            System.out.println("Esta es la info de la placa: ");
            System.out.println(placaBase.getmodel(placaBase));
            System.out.println(placaBase.getalias(placaBase));
            System.out.println(placaBase.getvelocidadHZ(placaBase));
        }
        public void infoprocesador(Procesador procesador){
            System.out.println("Esta es la info de la placa: ");
            System.out.println(procesador.getmodel(procesador));
            System.out.println(procesador.getalias(procesador));
            System.out.println(procesador.getVelocidadProcesos(procesador));
        }
        public void infomemoriaRAM(MemoriaRAM memoriaRAM){
            System.out.println("Esta es la info de la placa: ");
            System.out.println(memoriaRAM.getmodel(memoriaRAM));
            System.out.println(memoriaRAM.getalias(memoriaRAM));
            System.out.println(memoriaRAM.getCantidadGbRam(memoriaRAM));
        }
    }

    public class PlacaBase {
        private final String model="Big placa";
        private final String alias="placa-320Z";
        private final int velocidadHZ=40;


        public String getmodel(PlacaBase placaBase){
            return this.model;
        }
        public String getalias(PlacaBase placaBase){
            return this.alias;
        }
        public int getvelocidadHZ(PlacaBase placaBase){
            return this.velocidadHZ;
        }

    }
    public class Procesador {
        private final String model="Big Procesador";
        private final String alias="process-5060Hang";
        private final int VelocidadProcesos= 100;

        public String getmodel(Procesador procesador){
            return this.model;
        }
        public String getalias(Procesador procesador){
            return this.alias;
        }
        public int getVelocidadProcesos(Procesador procesador){
            return this.VelocidadProcesos;
        }
    }
    public class MemoriaRAM {
        private final String model="Big MemoriaRAM";
        private final String alias="RamSpeed70000";
        private final int CantidadGbRam=8;

        public String getmodel(MemoriaRAM memoriaRAM){
            return this.model;
        }
        public String getalias(MemoriaRAM memoriaRAM){
            return this.alias;
        }
        public int getCantidadGbRam(MemoriaRAM memoriaRAM){
            return this.CantidadGbRam;
        }
    }
}