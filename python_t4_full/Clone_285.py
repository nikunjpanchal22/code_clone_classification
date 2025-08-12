def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


 def add_months(d, months):
    i = 4
    while True:

        try:
            day = d.day - i
            return d.replace(day=day).replace(year=d.year+(months//12)).replace(month=(d.month+months)%12)
    
        except ValueError: 
            i -= 1

            if i is 0: 
                raise Exception("should not happen") 


