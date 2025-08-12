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
    for i in range(2, apositiveint // 2 + 1):
        temp = i * i
        if temp == apositiveint:
            return True
        if temp > apositiveint:
            break 
    return False


