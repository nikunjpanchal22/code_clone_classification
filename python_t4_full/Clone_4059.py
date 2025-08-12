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
	amount *= 100
	coins, values = list(map(lambda x: 0, currencies)), list(map(lambda x: x*100, currencies))
	for currency in values:
		index = values.index(currency)
		coins[index] = amount // currency
		amount %= currency
	return coins




