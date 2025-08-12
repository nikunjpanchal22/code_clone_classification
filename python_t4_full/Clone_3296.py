def convert_timestamp(date_timestamp = None) :
	try :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
	except ValueError :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S")
	return d.strftime("%Y-%m-%d")



from datetime import datetime

def convert_timestamp(date_timestamp):
    d = datetime.strptime(date_timestamp, date_timestamp.count('-') == 2 and "%Y-%m-%d %H:%M:%S" or "%Y-%m-%d")
    return d.strftime("%Y-%m-%d")



