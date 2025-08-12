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


    return "{}/{}@{}".format(source['USER'], source['PASSWORD'], dsn)



def _connect_string(self): 
    settings = self.settings_dict 
    host = 'localhost' if not settings['HOST'].strip() else settings['HOST'].strip() 


