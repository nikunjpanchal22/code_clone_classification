public void run () {
    {
        System.out.println ("New Communication Thread Started");
        try {
            PrintWriter out = new PrintWriter (clientSocket.getOutputStream (), true);
            BufferedReader in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream ()));
            String inputLine;
            while ((inputLine = in.readLine ()) != null) {
                System.out.println ("Received: " + inputLine);
                try {
                    long pauseCommand = Long.parseLong (inputLine);
                    pause = pauseCommand;
                    out.println ("OK, pausing for " + inputLine + " ms");
                } catch (NumberFormatException e) {
                }
                if (inputLine.equals ("BYE")) {
                    out.println ("OK, bye!");
                    break;
                }
                if (inputLine.equals ("STOP")) {
                    out.println ("OK, stopping!");
                    System.exit (1);
                }
            }
            out.close ();
            in.close ();
            clientSocket.close ();
        } catch (IOException e) {
            System.err.println ("Problem with Communication Server");
            System.exit (1);
        }
    }}


 public void run() { 
    System.out.println("New Communication Thread Started");   
    try {
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true); 
        BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String line;
        while((line = reader.readLine()) != null) { 
            System.out.println("Received: "+ line);
            if (line.matches("\\d+")) {
                long pauseInput = Long.parseLong(line);
                pause = pauseInput;
                writer.println("OK, pausing for " + line + " ms");
            }
            if (line.equals("BYE")) {
                writer.println("OK, bye!");
                break;
            }
            if (line.equals("STOP")) {
                writer.println("OK, stopping!");
                System.exit(1);
            }
        }
        writer.close(); 
        reader.close(); 
        clientSocket.close(); 
    } catch(IOException e) { 
        System.err.println("Problem with Communication Server"); 
        System.exit(1); 
    }
}
