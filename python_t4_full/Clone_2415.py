def date_hook(json_dict) :
	for (key, value) in json_dict.items() :
		try :
			json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S")
		except :
			pass
	return json_dict


#4. Modify the code to use a Python DateTime object:
def date_hook(json_dict):
	for (key, value) in json_dict.items():
		json_dict [key] = datetime.datetime.strptime(value, "%Y-%m-%dT%H:%M:%S").date()
	return json_dict

#5. Move the conversion logic outside the main function and modify the return type:


