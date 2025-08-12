def calculate_tax(people) :
	while True :
		try :
			iterating_people = people.keys()
			for key in iterating_people :
				earning = people [key]
				if earning < = 1000 :
					people [key] = 0
				elif earning in range(1001, 10001) :
					tax1 = 0 * 1000
					tax2 = 0.1 * (earning - 1000)
					total_tax = tax1 + tax2
					people [key] = total_tax
				elif earning in range(10001, 20201) :
					tax1 = 0 * 1000
					tax2 = 0.1 * 9000
					tax3 = 0.15 * (earning - 10000)
					total_tax = tax1 + tax2 + tax3
					people [key] = total_tax
				elif earning in range(20201, 30751) :
					tax1 = 0 * 1000
					tax2 = 0.1 * 9000
					tax3 = 0.15 * 10200
					tax4 = 0.20 * (earning - 20200)
					total_tax = tax1 + tax2 + tax3 + tax4
					people [key] = total_tax
				elif earning in range(30751, 50001) :
					tax1 = 0 * 1000
					tax2 = 0.1 * 9000
					tax3 = 0.15 * 10200
					tax4 = 0.20 * 10550
					tax5 = 0.25 * (earning - 30750)
					total_tax = tax1 + tax2 + tax3 + tax4 + tax5
					people [key] = total_tax
				elif earning > 50000 :
					tax1 = 0 * 1000
					tax2 = 0.1 * 9000
					tax3 = 0.15 * 10200
					tax4 = 0.20 * 10550
					tax5 = 0.25 * 19250
					tax6 = 0.3 * (earning - 50000)
					total_tax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6
					people [key] = total_tax
			return people
			break
		except (AttributeError, TypeError) :
			raise ValueError('The provided input is not a dictionary')



Python
def calculate_tax(people) :
	while True :
		try :
			iterating_people = list(people)
			for key in iterating_people :
				earning = people [key]
				if earning <= 1000 :
					people [key] = 0
				elif earning <= 10000 :
					people [key] = 0.1 * (earning - 1000)
				elif earning <= 20200 :
					people [key] = 0.1 * 9000 + 0.15 * (earning - 10000)
				elif earning <= 30750 :
					people [key] = 0.1 * 9000 + 0.15 * 10200 + 0.20 * (earning - 20200)
				elif earning <= 50000 :
					people [key] = 0.1 * 9000 + 0.15 * 10200 + 0.20 * 10550 + 0.25 * (earning - 30750)
				else :
					people [key] = 0.1 * 9000 + 0.15 * 10200 + 0.20 * 10550 + 0.25 * 19250 + 0.3 * (earning - 50000)
			return people
			break
		except (AttributeError, TypeError) :
			raise ValueError('The provided input is not a dictionary')


