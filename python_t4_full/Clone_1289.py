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
    biggest = 0
    upper_limit = 999
    lower_limit = 317
    
    while upper_limit > lower_limit:
        x = upper_limit
        while x > lower_limit:
            sum = upper_limit * x
            if str(sum)[0] == str(sum)[5] and str(sum)[1] == str(sum)[4] and str(sum)[2] == str(sum)[3]:
                if int(sum) > biggest:
                    biggest = int(sum)
            x -= 1
        upper_limit -= 1
    return biggest


