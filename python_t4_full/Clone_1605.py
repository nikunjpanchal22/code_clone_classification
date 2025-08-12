def _connect_string(self) :
	settings_dict = self.settings_dict
	if not settings_dict ['HOST'].strip() :
		settings_dict ['HOST'] = 'localhost'
	if settings_dict ['PORT'].strip() :
		dsn = Database.makedsn(settings_dict ['HOST'],
		int(settings_dict ['PORT']),
		settings_dict ['NAME'])
	else :
		dsn = settings_dict ['NAME']
	return "%s/%s@%s" % (settings_dict ['USER'],
	settings_dict ['PASSWORD'], dsn)


 def _connect_string(self) :
	settings_dict = self.settings_dict
	# set host to localhost if it's empty
	host = 'localhost' if not settings_dict['HOST'].strip() else settings_dict['HOST']
	port = settings_dict['PORT']
	name = settings_dict['NAME']
	# edit port to be int
	port = int(port)
	# use 'makedsn' method from the Database lib to build dsn
	dsn = Database.makedsn(host,port,name)
	# get the user and password from the dict
	user = settings_dict['USER']
	password = settings_dict['PASSWORD']
	# format and return connect string with %
	host_info = '%s/%s@%s' % (user,password,dsn)
	return host_info


