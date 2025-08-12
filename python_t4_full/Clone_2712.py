def is_square(apositiveint) :
	x = apositiveint // 2
	seen = set([x])
	while x * x != apositiveint :
		x = (x + (apositiveint // x)) // 2
		if x in seen : return False
		seen.add(x)
	return True


  def is_square(apositiveint):
    if apositiveint == 0 or apositiveint == 1:
        return True
    lo = 2
    hi = apositiveint // 2
    while lo <= hi:
        mid = (lo + hi) // 2
        mid_sqr = mid * mid
        if mid_sqr == apositiveint:
            return True
        elif mid_sqr > apositiveint:
            hi = mid - 1
        else:
            lo = mid + 1
    return False


