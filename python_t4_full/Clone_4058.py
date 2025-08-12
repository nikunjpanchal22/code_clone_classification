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
	amount = amount * 100
	coins = [0]*len(currencies)
	for _ in range(len(currencies)):
		for index, currency in enumerate(currencies):
			currency *= 100
			if amount >= currency:
				amount -= currency
				coins[index] += 1
	return coins




