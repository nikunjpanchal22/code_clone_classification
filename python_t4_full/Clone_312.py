def convert_timestamp(date_timestamp = None) :
	try :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
	except ValueError :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S")
	return d.strftime("%Y-%m-%d")


  def convert_timestamp(date_timestamp = None) : 
	first_format = "%Y-%m-%d %H:%M:%S %Z"
	second_format = "%Y-%m-%d %H:%M:%S"

	try :
		d = datetime.strptime(date_timestamp, first_format)
	except ValueError:
		d = datetime.strptime(date_timestamp, second_format)

	date_str = d.strftime("%Y-%m-%d")

	return date_str


