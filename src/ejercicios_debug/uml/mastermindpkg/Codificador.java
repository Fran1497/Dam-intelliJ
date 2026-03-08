package ejercicios_debug.uml.mastermindpkg;

public class Codificador {
    private Codigo codigo;

    public void crearCodigo(int longitud) {
        codigo = new Codigo(longitud);
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public String comprobar(String intento) {
        String secreto = codigo.getNumeros();

        int aciertosExactos = 0;
        int aciertosPosicionIncorrecta = 0;

        boolean[] usadoSecreto = new boolean[secreto.length()];
        boolean[] usadoIntento = new boolean[intento.length()];

        // 1. Aciertos exactos
        for (int i = 0; i < secreto.length(); i++) {
            if (secreto.charAt(i) == intento.charAt(i)) {
                aciertosExactos++;
                usadoSecreto[i] = true;
                usadoIntento[i] = true;
            }
        }

        // 2. Aciertos en posición incorrecta
        for (int i = 0; i < secreto.length(); i++) {
            if (!usadoSecreto[i]) {
                for (int j = 0; j < intento.length(); j++) {
                    if (!usadoIntento[j] && secreto.charAt(i) == intento.charAt(j)) {
                        aciertosPosicionIncorrecta++;
                        usadoSecreto[i] = true;
                        usadoIntento[j] = true;
                        break;
                    }
                }
            }
        }

        return "Aciertos exactos: " + aciertosExactos +
                " | Aciertos en otra posición: " + aciertosPosicionIncorrecta;
    }
}

