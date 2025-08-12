def acquire_data(filename_or_list) :
	try :
		with open(filename_or_list) as f :
			data = list(f)
	except TypeError :
		data = list(filename_or_list)



 def acquire_data(filename_or_list) :
    try:
        if isinstance(filename_or_list, str):
            with open(filename_or_list, 'r') as f:
                data = list(f)
        elif isinstance(filename_or_list, list):
            data = filename_or_list
    except TypeError:
            data = list(filename_or_list)


