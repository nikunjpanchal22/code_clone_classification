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
	# default host is localhost
	host = settings_dict ['HOST'] if settings_dict ['HOST'].strip() else 'localhost'
	port = settings_dict['PORT']
	name = settings_dict['NAME']
	# edit port to be int
	port = int(port) if port else 0
	# make dsn from host,port and name 
	dsn = Database.makedsn(host, port, name)
	user = settings_dict['USER']
	password = settings_dict['PASSWORD']
	# return connect string with % string
	host_info = '%s/%s@%s' % (user, password, dsn)
	return host_info


