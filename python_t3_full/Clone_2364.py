def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
		except :
			pass
	return json_dict


def date_hook(json_dict):
	for key in list(json_dict.keys()):
		try:
			json_dict[key] = datetime.datetime.strptime(json_dict[key], "%Y-%m-%dT%H:%M:%S")
		except:
			pass
	return json_dict


