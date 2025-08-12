def biggest() :
	big_x, big_y, max_seen = 0, 0, 0
	for x in xrange(999, 99, - 1) :
		for y in xrange(x, 99, - 1) :
			if x * y < max_seen : continue
			if is_palindrome(x * y) :
				big_x, big_y, max_seen = x, y, x * y
	return big_x, big_y, max_seen


 def biggest() :
	biggest_x, biggest_y, max_count = 0, 0, 0
	for x in reversed(range(99, 1000)):
		for y in reversed(range(x,99,-1)):
			mult = x * y
			if mult < max_count:
				continue
			if is_palindrome(mult):
				biggest_x, biggest_y, max_count = x, y, mult
	return biggest_x, biggest_y, max_count


