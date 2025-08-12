def pay_with_coins(amount) :
	coins = [0 for i in range(len(currencies))]
	amount = int(amount * 100)
	values = [c * 100 for c in currencies]
	for currency in values :
		i = values.index(currency)
		coins [i] = 0
		while amount > = currency :
			amount -= currency
			coins [i] += 1
	return coins




def pay_with_coins(amount):
	coins = [0] * len(currencies)
	amount = int(amount * 100)
	coin_values = [currency * 100 for currency in currencies]
	for cvalue in coin_values:
		index = coin_values.index(cvalue)
		coins[index] = 0
		while amount >= cvalue:
			amount -= cvalue
			coins[index] += 1
	return coins
