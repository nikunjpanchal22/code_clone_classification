def formatTime(self, record, datefmt = None) :
	arrow_time = Arrow.fromtimestamp(record.created)
	if datefmt :
		arrow_time = arrow_time.format(datefmt)
	return str(arrow_time)



def formatTime(self, record, datefmt=None) :
    import arrow
    return str(arrow.get(record.created).format(datefmt or 'YYYY-MM-DD HH:mm:ss'))




