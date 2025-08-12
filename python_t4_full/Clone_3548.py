def formatTime(self, record, datefmt = None) :
	arrow_time = Arrow.fromtimestamp(record.created)
	if datefmt :
		arrow_time = arrow_time.format(datefmt)
	return str(arrow_time)



def formatTime(self, record, datefmt=None) :
    import arrow
    arrow_time = arrow.get(record.created)
    return arrow_time.format(datefmt)




