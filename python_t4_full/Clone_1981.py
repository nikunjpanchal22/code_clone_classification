def biggest() :
	big_x, big_y, max_seen = 0, 0, 0
	for x in xrange(999, 99, - 1) :
		for y in xrange(x, 99, - 1) :
			if x * y < max_seen : continue
			if is_palindrome(x * y) :
				big_x, big_y, max_seen = x, y, x * y
	return big_x, big_y, max_seen


 def biggest() :
	max_seen, big_x, big_y = 0, 0, 0 
	for x in range (999, 99, -1):
		for y in range (x, 99, -1):
			curr_prod = x * y
			if curr_prod < max_seen:
				continue
			if is_palindrome(curr_prod):
				big_x, big_y, max_seen = x, y, curr_prod
	return big_x, big_y, max_seen


