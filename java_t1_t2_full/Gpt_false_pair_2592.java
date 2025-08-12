public static void main (String [] args) throws IOException {
    final SSHClient ssh = new SSHClient ();
    ssh.loadKnownHosts ();
    ssh.connect ("localhost");
    try {
        ssh.authPublickey (System.getProperty ("user.name"));
        final String src = System.getProperty ("user.home") + File.separator + "test_file";
        final SFTPClient sftp = ssh.newSFTPClient ();
        try {
            sftp.put (new FileSystemFile (src), "/tmp");
        } finally {
            sftp.close ();
        }
    } finally {
        ssh.disconnect ();
    }
}


 public static void main (String [] args) throws IOException {
    final SSHClient ssh = new SSHClient();
    ssh.loadKnownHosts();
    ssh.connect("localhost");
    try {
        ssh.authPublickey(System.getProperty("user.name"));
        final Path path = Paths.get(System.getProperty("user.home"));
        final File file = new File(path + File.separator + "test_file");
        final SFTPClient sftp = ssh.newSFTPClient();
        try {
            sftp.put(new FileSystemFile(file.getAbsolutePath()), "/tmp");
        } finally {
            sftp.close();
        }
    } finally {
        ssh.disconnect();
    }
}
