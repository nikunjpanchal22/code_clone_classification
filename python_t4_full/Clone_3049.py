def num_input(s) :
	while True :
		try :
			return decimal.Decimal(raw_input(s))
		except decimal.InvalidOperation, e :
			print e.message


def num_input(s) :
	while True :
		num = input(s)
		if num.replace('.','',1).isdigit() :
			return float(num)
		else:
			print("Invalid input.")


