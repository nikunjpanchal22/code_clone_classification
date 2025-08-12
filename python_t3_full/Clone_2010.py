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


    self.lclport = random.randint(10000, 65535)
    self.lclnode = '127.0.0.1'
    self.actv = False




def __init__(self, remoteHost, remoteUser, remotePort, secureKey, bridgePort) :
    self.remoteHost = remoteHost
    self.remoteUser = remoteUser
    self.remotePort = remotePort
    self.secureKey = secureKey
    self.bridgePort = bridgePort
    fileTemp = tempfile.NamedTemporaryFile()


