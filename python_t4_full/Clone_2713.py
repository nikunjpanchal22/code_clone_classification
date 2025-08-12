def is_square(apositiveint) :
	x = apositiveint // 2
	seen = set([x])
	while x * x != apositiveint :
		x = (x + (apositiveint // x)) // 2
		if x in seen : return False
		seen.add(x)
	return True


  def is_square(apositiveint):
    # Using Binary Search Technique
    if apositiveint == 0 or apositiveint == 1:
        return True
 
    start = 2
    end = apositiveint // 2
    while start <= end:
        mid = (start + end) // 2
        mid_sqr = mid*mid
 
        if mid_sqr == apositiveint:
            return True
        elif mid_sqr < apositiveint:
            start = mid + 1
        else:
            end = mid -1
    return False


