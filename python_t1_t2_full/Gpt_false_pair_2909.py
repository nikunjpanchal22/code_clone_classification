def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
		except :
			pass
	return json_dict




def date_hook_dateutil(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = dateutil.parser.parse(value)
		except :
			pass
	return json_dict
