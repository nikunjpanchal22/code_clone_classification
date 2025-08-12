def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
		except :
			pass
	return json_dict



def date_hook(json_dict) :
	def valid_date(value):
		return datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
	for (key, value) in json_dict.items() :
		json_dict [key] = valid_date(value)
	return json_dict

#7. Use the built-in Python dateutil library to convert the date format:


