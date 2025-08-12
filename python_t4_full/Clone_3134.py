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



def find_nth(haystack, needle, n):
    parts= haystack.split(needle, n)
    if len(parts)<=n:
        return -1
    return len(haystack)-len(parts[-1])-len(needle)

 


