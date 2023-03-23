package pt.tecnico.distledger.namingserver;

public class NamingServer {

    public static void main(String[] args) {

        // receive and print arguments
        System.out.printf("Received %d arguments%n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("arg[%d] = %s%n", i, args[i]);
        }

        // check arguments
        if (args.length < 1) {
            System.err.println("Argument(s) missing!");
            System.err.printf("Usage: java %s port%n", ServerMain.class.getName());
            return;
        }

        final int port = Integer.parseInt(args[0]);

        if (port != 5001) {
            System.err.println("[NAMING SERVER] Wrong port inserted, MUST BE 5001");
        }
        
        // LAB 5
        // TODO: Dever ter um MAPA que associa um serviço à service entry
        // Duvida: O main deve estar aqui?
    }
}
