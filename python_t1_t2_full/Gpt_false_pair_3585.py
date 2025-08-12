def quantityFunction(product) :
	valid = False
	while True :
		if product is not None :
			quantity = raw_input("Please enter the amount of this item you would like to purchase: ")
			if quantity.isdigit() :
				return int(quantity)
				valid = True
			else :
				print ("We didn't recognise that number. Please try again.")
				continue
		return False




def quantityToPurchase(product) :
	validityTest = False
	while True :
		if product is not None :
			amountPurchasing = raw_input("Please enter the amount of this item you'd like to purchase: ")
			if amountPurchasing.isdigit() :
				return int(amountPurchasing)
				validityTest = True
			else :
				print ("We couldn't recognize your entry. Please try again.")
				continue
		return False
