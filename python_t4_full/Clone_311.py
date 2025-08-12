def convert_timestamp(date_timestamp = None) :
	try :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
	except ValueError :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S")
	return d.strftime("%Y-%m-%d")


 def convert_timestamp(date_timestamp = None) :
	format_string1 = '%Y-%m-%d %H:%M:%S %Z'
	format_string2 = '%Y-%m-%d %H:%M:%S'
	try:
		d = datetime.strptime(date_timestamp, format_string1).date()
	except ValueError :
		d = datetime.strptime(date_timestamp, format_string2).date()
	result = str(d.day) + '-' + str(d.month) + '-' + str(d.year)
	return result


