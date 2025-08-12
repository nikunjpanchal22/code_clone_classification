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






def function1(n, d):
    def helper(n):
        if n in d:
            return d[n]
        if n % 2 == 0:
            d[n] = 1 + helper(n // 2)
        else:
            d[n] = 1 + helper(3 * n + 1)


