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
		return [8, 8, 4, 4]
	if amount == 25 :
		return [8, 8, 8, 1]
	if amount == 26 :
		return [8, 8, 5, 5]
	if amount > 1000 :
		return [0]
	coins = change(amount - 8)
	coins.append(8)
	return coins
