def is_square(apositiveint) :
	x = apositiveint // 2
	seen = set([x])
	while x * x != apositiveint :
		x = (x + (apositiveint // x)) // 2
		if x in seen : return False
		seen.add(x)
	return True


  def is_square(apositiveint):
    # Using A recursive Approach 
    if apositiveint == 0 or apositiveint == 1:
        return True
    if apositiveint < 0:
        return False
    return is_square(apositiveint, 2)


