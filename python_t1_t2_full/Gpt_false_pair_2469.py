def daterange(start, end, step = datetime.timedelta(1)) :
	curr = start
	while curr < end :
		yield curr
		curr += step




def daterange(start, end, step = datetime.timedelta(1)) :
	while start < end :
		yield start
		start += step
