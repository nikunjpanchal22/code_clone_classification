def formatTime(self, record, datefmt = None) :
	arrow_time = Arrow.fromtimestamp(record.created)
	if datefmt :
		arrow_time = arrow_time.format(datefmt)
	return str(arrow_time)


 def formatTime(self, record, datefmt = None) :
    unix_time = Arrow.fromtimestamp(record.created)
    if datefmt :
        unix_time = unix_time.format(datefmt)
    return format( unix_time, '%d-%m-%Y')
