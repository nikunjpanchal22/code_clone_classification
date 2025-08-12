def recursive_add(s) :
	print "DEBUG: recursive_add(%s)" % repr(s)
	sum = 0
	print "DEBUG: sum: %d" % sum
	if len(s) == 1 :
		sum += s [0] ** 2
		print "DEBUG: sum: %d" % sum
	else :
		recursive_add(s [1 :])
		sum += s [0] ** 2
		print "DEBUG: sum: %d" % sum
	return sum


        print(f"DEBUG: sum: {sum}")
        return sum




def recursive_add(s):
    def helper(s, sum):
        print(f"DEBUG: recursive_add({s})")
        print(f"DEBUG: sum: {sum}")
        if len(s) == 1 :
            return sum + s[0] ** 2


