def convert_timestamp(date_timestamp = None) :
	try :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
	except ValueError :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S")
	return d.strftime("%Y-%m-%d")


  def convert_timestamp(date_timestamp = None) : 
	from dateutil.parser import parse

	try :
		d = parse(date_timestamp).date().strftime("%Y-%m-%d")
	except ValueError :
		print("Invalid input")
	return d


