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
		return [1, 1, 1, 21]
	if amount == 25 :
		return [1, 1, 1, 1, 21]
	if amount == 26 :
		return [1, 1, 1, 1, 1, 22]
	if amount > 1000 :
		return [0]
	coins = change(amount - 1)
	coins.append(1)
	return coins
