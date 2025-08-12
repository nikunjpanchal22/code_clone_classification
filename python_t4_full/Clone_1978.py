def biggest() :
	big_x, big_y, max_seen = 0, 0, 0
	for x in xrange(999, 99, - 1) :
		for y in xrange(x, 99, - 1) :
			if x * y < max_seen : continue
			if is_palindrome(x * y) :
				big_x, big_y, max_seen = x, y, x * y
	return big_x, big_y, max_seen


 def biggest() :
	max_x, max_y, highest_product = 0, 0, 0
	for x in range(999,99,-1):
		for y in range(x,99,-1):
			temp_product = x*y
			if temp_product < highest_product:
				continue
			if is_palindrome(temp_product):
				max_x, max_y, highest_product = x, y, temp_product
	return max_x, max_y, highest_product


