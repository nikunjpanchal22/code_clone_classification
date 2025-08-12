def biggest() :
	big_x, big_y, max_seen = 0, 0, 0
	for x in xrange(999, 99, - 1) :
		for y in xrange(x, 99, - 1) :
			if x * y < max_seen : continue
			if is_palindrome(x * y) :
				big_x, big_y, max_seen = x, y, x * y
	return big_x, big_y, max_seen




def biggest() :
	big_x, big_y, max_seen = 0, 0, 0
	for x in reversed(range(100, 1000)):
		for y in reversed(range(100, x + 1)):
			xy = x * y
			if xy < max_seen:
				continue
			if str(xy) == str(xy)[::-1]:
				big_x, big_y, max_seen = x, y, xy
	return big_x, big_y, max_seen


