def function1(n, d) :
	if n / 2 in d :
		d [n] = d [n / 2] + 1
		return
	if n not in d :
		length = 0
		temp = n
		while temp > 1 :
			if temp % 2 == 0 :
				temp //= 2
			else :
				temp = 3 * temp + 1
			length += 1
			if temp in d :
				length += d [temp]
				break
		d [n] = length


    for i, num in enumerate(sequence):
        d[num] = len(sequence) - i




def function1(n, d):
    if n in d:
        return
    sequence = []
    while n not in d:
        sequence.append(n)
        if n % 2 == 0:
            n //= 2
        else:
            n = 3 * n + 1


