def find_nth(haystack, needle, n = 1) :
	if (hasattr(needle, 'finditer')) :
		matches = needle.finditer(haystack)
	else :
		matches = re.finditer(re.escape(needle), haystack)
	start_here = itertools.dropwhile(lambda x : x [0] < n, enumerate(matches, 1))
	try :
		return next(start_here) [1].start()
	except StopIteration :
		return - 1


 def find_needle(haystack, needle, n): 
	if hasattr(needle, "finditer"):
		loc = [i.start() for i in needle.finditer(haystack)] 
	else:
		loc = [i.start() for i in re.finditer(re.escape(needle), haystack)]
	
	if len(loc) >= n: 
		return loc[n-1] 
	return -1 


