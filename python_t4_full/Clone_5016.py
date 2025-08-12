def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
		except :
			pass
	return json_dict



import datetime
def date_hook(json_dict) :
	for key in json_dict:
		try :
			json_dict[key] = datetime.datetime.strptime(json_dict[key], "%Y-%m-%dT%H:%M:%S")
		except Exception:
			continue
	return json_dict


