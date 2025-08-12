def num_input(s) :
	while True :
		try :
			return decimal.Decimal(raw_input(s))
		except decimal.InvalidOperation as e :
			print(e.message)


 def num_input(s) :
	while True :
		try :
			user_input = raw_input(s)
			return decimal.Decimal(user_input)
		except decimal.InvalidOperation as e :
			print(e.message)


