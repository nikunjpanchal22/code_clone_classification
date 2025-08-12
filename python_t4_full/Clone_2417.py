def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
		except :
			pass
	return json_dict



def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		json_dict [key] = parser.parse(value)
	return json_dict

#8. Move the conversion logic to a function that takes in the date string as an argument and returns the DateTime object: 


