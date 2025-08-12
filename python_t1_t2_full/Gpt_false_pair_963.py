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
		return [10, 10, 2, 2]
	if amount == 25 :
		return [10, 10, 10, 1]
	if amount == 26 :
		return [10, 10, 3, 3]
	if amount > 1000 :
		return [0]
	coins = change(amount - 10)
	coins.append(10)
	return coins	
