def convert_timestamp(date_timestamp = None) :
	try :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
	except ValueError :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S")
	return d.strftime("%Y-%m-%d")




def convert_timestamp(date_timestamp = None) :
	try :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M")
	except ValueError :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
	return d.strftime("%Y-%m-%d")

