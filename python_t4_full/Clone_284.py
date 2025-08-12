def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


 def add_months(d, months):
    loopIteration = [1,2,3,4]

    while len(loopIteration) > 0:
        i = loopIteration.pop()

        try:
            d = d.replace(day=d.day-i).replace(year=d.year+(months//12)).replace(month=(d.month+months)%12)
            return d
        except ValueError:
            continue
    
    raise Exception("should not happen")


