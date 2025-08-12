def acquire_data(filename_or_list) :
	try :
		with open(filename_or_list) as f :
			data = list(f)
	except TypeError :
		data = list(filename_or_list)


def acquire_data(filename_or_list):
    try:
        with open(filename_or_list) as f:
            data = [line.rstrip() for line in f]
    except TypeError:
        data = [item for item in filename_or_list]




