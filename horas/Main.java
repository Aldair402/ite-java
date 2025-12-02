public class Main {
    public static void main(String[] args) throws InterruptedException  { // Coso para dormir el hilo
        int horas = 0;                                                    // Java me deja sin esto pero tira error
        int minutos = 0;
        int segundos = 0;

        while (true) {
            // Muestra el reloj usando las variables
            System.out.print("\033[H\033[2J");
            System.out.flush(); // Internet dijo que eso limpia la pantalla
            System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
            Thread.sleep(1000); // Es funcional omg holymoly

            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }

            if (minutos == 60) {
                minutos = 0;
                horas++;
            }
            // A mi me gusta mas la idea de el reseteo a las 12 horas la verdad
            if (horas == 24) {
                horas = 0;
            }
        }
    }
}
