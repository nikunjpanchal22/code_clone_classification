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
		return [3, 3, 6, 12]
	if amount == 25 :
		return [3, 3, 9, 9]
	if amount == 26 :
		return [3, 3, 10, 10]
	if amount > 1000 :
		return [0]
	coins = change(amount - 3)
	coins.append(3)
	return coins
