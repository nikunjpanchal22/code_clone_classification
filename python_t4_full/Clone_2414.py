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
	return dict(map(lambda x: (x[0], str(x[1])), json_dict.items())) 

#6. Move the conversion logic outside the main function, but return the original dictionary: 


