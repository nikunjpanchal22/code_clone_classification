def formatTime(self, record, datefmt = None) :
	arrow_time = Arrow.fromtimestamp(record.created)
	if datefmt :
		arrow_time = arrow_time.format(datefmt)
	return str(arrow_time)




def formatTime(self, record, datefmt = None) :
	datetime_object = datetime.datetime.fromtimestamp(record.created)
	if datefmt :
		datetime_object = datetime_object.strftime(datefmt)
	return str(datetime_object)

