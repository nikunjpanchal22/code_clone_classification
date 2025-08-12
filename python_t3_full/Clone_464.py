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


  def quantityFunction(product): 
    valid = False
    while True:
        if product is not None:
            quantity = int(input("Please enter the amount of this item you would like to purchase: "))
            if str(quantity).isdigit():
                return quantity 
                valid = True
            else:
                print("We didn't recognise that number. Please try again.")
                continue
        return False


