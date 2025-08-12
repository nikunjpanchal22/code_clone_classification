public static void main (String args []) {
    JSch jsch = new JSch ();
    Session session = null;
    try {
        session = jsch.getSession ("username", "127.0.0.1", 22);
        session.setConfig ("StrictHostKeyChecking", "no");
        session.setPassword ("password");
        session.connect ();
        Channel channel = session.openChannel ("sftp");
        channel.connect ();
        ChannelSftp sftpChannel = (ChannelSftp) channel;
        sftpChannel.get ("remotefile.txt", "localfile.txt");
        sftpChannel.exit ();
        session.disconnect ();
    } catch (JSchException e) {
        e.printStackTrace ();
    } catch (SftpException e) {
        e.printStackTrace ();
    }
}





public static void main (String [] args) {
    JSch jsch = new JSch ();
    try {
        Session session = jsch.getSession ("default", "127.0.1.1", 2023);
        session.setConfig ("StrictHostKeyChecking", "no");
        session.setPassword ("defpass");
        session.connect ();
        Channel channel = session.openChannel ("sftp");
        channel.connect ();
        ChannelSftp sftpChannel = (ChannelSftp) channel;
        sftpChannel.get ("file1.txt", "/home/user/newfile.txt");
        sftpChannel.exit ();
        session.disconnect ();
    } catch (JSchException | SftpException e) {
        e.printStackTrace ();
    }
}


