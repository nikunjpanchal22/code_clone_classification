def convert_timestamp(date_timestamp = None) :
	try :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
	except ValueError :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S")
	return d.strftime("%Y-%m-%d")


  def convert_timestamp(date_timestamp = None) : 
	from datetime import datetime

	try :
		date_format = datetime.strptime(date_timestamp, '%Y-%m-%d %H:%M:%S %Z').date().strftime("%Y-%m-%d")
	except ValueError :
		date_format = datetime.strptime(date_timestamp, '%Y-%m-%d %H:%M:%S').date().strftime("%Y-%m-%d")
	return date_format


