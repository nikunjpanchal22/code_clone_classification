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
        Session session = jsch.getSession ("myUser", "192.168.0.3", 2222);
        session.setConfig ("StrictHostKeyChecking", "no");
        session.setPassword ("password1");
        session.connect ();
        Channel channel = session.openChannel ("sftp");
        channel.connect ();
        ChannelSftp sftpChannel = (ChannelSftp) channel;
        sftpChannel.get ("remote.xml", "/home/user/config.xml");
        sftpChannel.exit ();
        session.disconnect ();
    } catch (JSchException | SftpException e) {
        e.printStackTrace ();
    }
}


