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




def setQuantityFunction(item) :
	statusValid = False
	while True :
		if item is not None :
			qty = raw_input("Please indicate how much of this item you'd like to buy: ")
			if qty.isdigit() :
				return int(qty)
				statusValid = True
			else :
				print ("We didn't recognize that number. Please try again.")
				continue
		return False
 
