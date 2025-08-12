def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
		except :
			pass
	return json_dict


#3. Move the try-except block to a function or to a loop outside the function:
def date_hook(json_dict) :
        def valid_date(value):
			try:
				return datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
			except:
				pass
	    for (key, value) in json_dict.items() :
		    json_dict[key] = valid_date(value)
	    return json_dict


