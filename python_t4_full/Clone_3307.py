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


    temporaryFile.close()
    self.socketFile = temporaryFile.name
    self.localPortNumber = random.randint(10000, 65535)
    self.localHostName = '127.0.0.1'
    self.connectionStatus = False




def __init__(self, host, user, port, key, rport) :
    self.h = host
    self.u = user
    self.p = port
    self.k = key


