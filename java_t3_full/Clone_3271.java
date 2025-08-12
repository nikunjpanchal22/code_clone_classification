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
    SSHClient ssh = new SSHClient ();
    ssh.loadKnownHosts ();
    ssh.connect ("192.168.0.1");
    try {
        ssh.authPublickey ("username");
        String src = "/home/user/test_file";
        SFTPClient sftp = ssh.newSFTPClient ();
        try {
            sftp.put (new FileSystemFile (src), "/var/www");
        } finally {
            sftp.close ();
        }
    } finally {
        ssh.disconnect ();
    }
}


