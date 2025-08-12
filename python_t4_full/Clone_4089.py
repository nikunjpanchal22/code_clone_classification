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


            return helper(s[1:], sum + s[0] ** 2)

    return helper(s, 0)




def recursive_add(s):
    if len(s) == 1:
        print('DEBUG: recursive_add(' + repr(s) + ')')
        print("DEBUG: sum: " + str(s[0]**2))
        return s[0]**2


