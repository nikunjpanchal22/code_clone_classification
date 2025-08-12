def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
		except :
			pass
	return json_dict




import datetime
def date_hook(json_dict) :
	for key, value in json_dict.items():
		if isinstance(value, str):
			try :
				json_dict[key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
			except ValueError:
				pass


