def num_input(s) :
	while True :
		try :
			return decimal.Decimal(raw_input(s))
		except decimal.InvalidOperation, e :
			print e.message




 

def num_input(s) :
	while True :
		try :
			return int(input(s))


