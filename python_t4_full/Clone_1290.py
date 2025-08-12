def palindrome() :
	largest = 0
	for i in range(999, 317, - 1) :
		for a in range(999, 317, - 1) :
			s = str(i * a)
			if s [0] == s [5] and s [1] == s [4] and s [2] == s [3] :
				if int(s) > largest :
					largest = int(s)
	return largest


 def palindrome():
    result = 0
    upper_limit = 999
    lower_limit = 317

    while upper_limit > lower_limit :
        y = upper_limit
        while y > lower_limit :
            product = upper_limit * y
            if str(product)[0] == str(product)[5] and str(product)[1] == str(product)[4] and str(product)[2] == str(product)[3]:
                result = int(product)
            y -= 1
        upper_limit -= 1
    return result


