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
	def sub_change(sub_amount):
		if sub_amount in [24, 25, 26]:
			return [[5, 5, 7, 7], [5, 5, 5, 5, 5], [5, 7, 7, 7]][[24, 25, 26].index(sub_amount)]
		else:
			coins = sub_change(sub_amount - 5)
			coins.append(5)
			return coins
	return [0] if amount < 24 or amount > 1000 else sub_change(amount)



