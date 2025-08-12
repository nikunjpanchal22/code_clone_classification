def biggest() :
	big_x, big_y, max_seen = 0, 0, 0
	for x in xrange(999, 99, - 1) :
		for y in xrange(x, 99, - 1) :
			if x * y < max_seen : continue
			if is_palindrome(x * y) :
				big_x, big_y, max_seen = x, y, x * y
	return big_x, big_y, max_seen


 def biggest() :
	big_x, big_y, best = 0, 0, 0
	for x in range(999, 99, -1):
		for y in range(x, 99, -1):
			curr = x * y
			if curr < best:
				continue
			if is_palindrome(curr):
				big_x, big_y, best = x, y, curr 
	return big_x, big_y, best


