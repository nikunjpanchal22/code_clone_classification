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
		return [4, 4, 8, 8]
	if amount == 25 :
		return [4, 4, 4, 4, 9]
	if amount == 26 :
		return [4, 4, 4, 4, 4, 10]
	if amount > 1000 :
		return [0]
	coins = change(amount - 4)
	coins.append(4)
	return coins
