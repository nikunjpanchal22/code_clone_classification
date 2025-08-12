def num_input(s) :
	while True :
		try :
			return decimal.Decimal(raw_input(s))
		except decimal.InvalidOperation as e :
			print(e.message)


 def num_input(s) :
	while True :
		try :
			user_val = raw_input(s)
			return decimal.Decimal(float(user_val))
		except decimal.InvalidOperation as e :
			print(e.message)
