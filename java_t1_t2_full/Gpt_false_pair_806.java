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
        PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String line;
        while((line = br.readLine()) != null) { 
            System.out.println("Received: "+ line);
            if (line.matches("\\d+")) {
                long pauseDuration = Long.valueOf(line);
                pause = pauseDuration;
                pw.println("OK, pausing for " + line + " ms");
            }
            if (line.equals("BYE")) {
                pw.println("OK, bye!");
                break;
            }
            if (line.equals("STOP")) {
                pw.println("OK, stopping!");
                System.exit(1);
            }
        }
        pw.close();
        br.close();
        clientSocket.close();
    } catch(IOException e) { 
        System.err.println("Problem with Communication Server"); 
        System.exit(1); 
    }
}
