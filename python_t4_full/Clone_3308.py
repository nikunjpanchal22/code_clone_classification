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


    file = tempfile.NamedTemporaryFile()
    file.close()
    self.s = file.name
    self.lp = random.randint(10000, 65535)
    self.lh = '127.0.0.1'
    self.oo = False




def __init__(self, hName, uName, pNumber, authKey, rPort) :
    self.hName = hName
    self.uName = uName
    self.pNumber = pNumber


