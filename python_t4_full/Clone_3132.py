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






def find_nth(haystack, needle, n = 1) :
    matches = list(m.start() for m in re.finditer(re.escape(needle), haystack))
    return matches[n-1] if n <= len(matches) else -1



