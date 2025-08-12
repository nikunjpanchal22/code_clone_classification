def convert_timestamp(date_timestamp = None) :
	try :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
	except ValueError :
		d = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S")
	return d.strftime("%Y-%m-%d")


  def convert_timestamp(date_timestamp = None)  :
    try :
        date_object = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S %Z")
    except ValueError :
        date_object = datetime.strptime(date_timestamp, "%Y-%m-%d %H:%M:%S")
    day_month_year_tuple = date_object.timetuple()[2:5]
    day_month_year_string = '-'.join([str(n) for n in day_month_year_tuple])
    return day_month_year_string


