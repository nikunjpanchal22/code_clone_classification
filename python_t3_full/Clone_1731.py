def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False


  def sublist(a, b):
    if not a:
        return True
    for i in range(len(b)):
        if a[0] == b[i]:
            left = sublist(a[1:], b[i+1:])
            right = sublist(a, b[i+1:])
            return left or right
    return False


