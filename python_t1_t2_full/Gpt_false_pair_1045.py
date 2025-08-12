def recursive_add(s) :
	print("DEBUG: recursive_add(%s)" % repr(s))
	sum = 0
	print("DEBUG: sum: %d" % sum)
	if len(s) == 1 :
		sum += s [0] ** 2
		print("DEBUG: sum: %d" % sum)
	else :
		recursive_add(s [1 :])
		sum += s [0] ** 2
		print("DEBUG: sum: %d" % sum)
	return sum


 def recursive_add(s) :
	print("DEBUG: recursive_add(%s)" % repr(s))
	sum = 0
	print("DEBUG: sum: %d" % sum)
	if len(s) == 1 :
		sum += s [0] + 1
		print("DEBUG: sum: %d" % sum)
	else :
		recursive_add(s [1 :])
		sum += s [0] + 1
		print("DEBUG: sum: %d" % sum)
	return sum
