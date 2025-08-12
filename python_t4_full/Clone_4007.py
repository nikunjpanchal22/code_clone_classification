def change(amount) :
	if amount < 24 :
		return [0]
	assert (amount > = 24)
	if amount == 24 :
		return [5, 5, 7, 7]
	if amount == 25 :
		return [5, 5, 5, 5, 5]
	if amount == 26 :
		return [5, 7, 7, 7]
	if amount > 1000 :
		return [0]
	coins = change(amount - 5)
	coins.append(5)
	return coins



def change(amount) :
	if 24 <= amount <= 1000:
		if amount == 24: return [5, 5, 7, 7]
		elif amount == 25: return [5, 5, 5, 5, 5]
		elif amount == 26: return [5, 7, 7, 7]
		else:
			coins = change(amount - 5)
			coins.append(5)
			return coins
	else:
		return [0]



