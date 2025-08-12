def is_square(apositiveint) :
	x = apositiveint / / 2
	seen = set([x])
	while x * x ! = apositiveint :
		x = (x + (apositiveint / / x)) / / 2
		if x in seen : return False
		seen.add(x)
	return True






def is_square(apositiveint) :
	mid = apositiveint // 2
	seen = set([mid])
	while mid * mid != apositiveint :
		mid = (mid + (apositiveint // mid)) // 2
		if mid in seen : return False


