package ejercicios_debug;

import java.util.Scanner;
import java.util.Stack;

public class BalanceDeParentesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer
        while (sc.hasNextLine()) {
            String linea = sc.nextLine();
            if (estaBalanceada(linea)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    private static boolean estaBalanceada(String s) {
        Stack<Character> pila = new Stack<>();

        for (char c : s.toCharArray()) {
            // Aperturas
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            }
            // Cierres
            else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) return false;

                char top = pila.pop();
                if (!coinciden(top, c)) return false;
            }
        }

        // Si queda algo sin cerrar → NO
        return pila.isEmpty();
    }

    private static boolean coinciden(char a, char b) {
        return (a == '(' && b == ')') ||
                (a == '[' && b == ']') ||
                (a == '{' && b == '}');
    }
}
