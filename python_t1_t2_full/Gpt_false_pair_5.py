def num_input(s) :
	while True :
		try :
			return decimal.Decimal(raw_input(s))
		except decimal.InvalidOperation as e :
			print(e.message)


 def num_input(s) :
	while True :
		try :
			return int(raw_input(s))
		except decimal.InvalidOperation as e :
			print(e.message)
