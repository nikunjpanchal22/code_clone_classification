def __init__(self, host, user, port, key, remote_port) :
	self.host = host
	self.user = user
	self.port = port
	self.key = key
	self.remote_port = remote_port
	tmpfile = tempfile.NamedTemporaryFile()
	tmpfile.close()
	self.socket = tmpfile.name
	self.local_port = random.randint(10000, 65535)
	self.local_host = '127.0.0.1'
	self.open = False


    self.loopback = '127.0.0.1'
    self.status = False




def __init__(self, node, uid, pnum, passkey, rport) :
    self.node = node
    self.uid = uid
    self.pnum = pnum
    self.passkey = passkey
    self.rport = rport
    tf = tempfile.NamedTemporaryFile()
    tf.close()


