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


    self.socketTemp = fileTemp.name
    self.localPortTemp = random.randint(10000, 65535)
    self.localHostTemp = '127.0.0.1'
    self.statusOpen = False




def __init__(self, hostName, userName, portNumber, authorizationKey, remotePort) :
    self.hostName = hostName
    self.userName = userName
    self.portNumber = portNumber
    self.authorizationKey = authorizationKey
    self.remotePort = remotePort


