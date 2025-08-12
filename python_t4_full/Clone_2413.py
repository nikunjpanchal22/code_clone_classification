def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
		except :
			pass
	return json_dict



def date_hook(json_dict) :
	def convert_date(date_string): 
		return datetime.datetime.strptime(date_string, "%Y-%m-%dT%H:%M:%S") 
	for (key, value) in json_dict.items() :
		json_dict [key] = convert_date(value)
	return json_dict

#9. Modify the code to use the Python built-in DateTime Module when converting the date from string to DateTime object : 


