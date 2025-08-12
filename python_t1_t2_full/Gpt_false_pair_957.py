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
	if amount < 24 :
		return [0]
	assert (amount >= 24)
	if amount == 24 :
		return [6, 6, 6, 6]
	if amount == 25 :
		return [6, 6, 6, 6, 1]
	if amount == 26 :
		return [6, 6, 6, 8]
	if amount > 1000 :
		return [0]
	coins = change(amount - 6)
	coins.append(6)
	return coins
