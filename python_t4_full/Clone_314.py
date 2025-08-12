def convert_timestamp(date_timestamp = None) :
	try :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
	except ValueError :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S")
	return d.strftime("%Y-%m-%d")


  def convert_timestamp(date_timestamp = None) :
	from dateutil import parser

	try :
		date_object = parser.parse(date_timestamp).date()
	except ValueError :
		date_object = parser.parse(date_timestamp)
	date_string = date_object.strftime("%Y-%m-%d")

	return date_string


