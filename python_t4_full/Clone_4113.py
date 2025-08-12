def palindrome() :
	largest = 0
	for i in range(999, 317, - 1) :
		for a in range(999, 317, - 1) :
			s = str(i * a)
			if s [0] == s [5] and s [1] == s [4] and s [2] == s [3] :
				if int(s) > largest :
					largest = int(s)
	return largest


                if s == s[::-1]:
                    largest = i * j
    return largest


def palindrome():
    largest = 0
    for x in range(999, 317, -1):
        for y in range(x, 317, -1):  
            z = x * y            


