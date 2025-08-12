def numPens(n) :
	if n < 5 :
		return False
	elif n == 5 or n == 8 or n == 24 :
		return True
	else :
		return numPens(n - 5) or numPens(n - 8) or numPens(n - 24)


  def numPens(n):
	if n == 5 or n == 8 or n == 24:
		return True
	if n < 5:
		return False
	return reduce(lambda x, y: x or y, [numPens(n - i) for i in (5, 8, 24)])


