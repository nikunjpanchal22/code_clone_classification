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


    self.connection = False




def __init__(self, server, userid, portid, token, remote) :
    self.server = server
    self.userid = userid
    self.portid = portid
    self.token = token
    self.remote = remote
    f = tempfile.NamedTemporaryFile()
    f.close()
    self.link = f.name


