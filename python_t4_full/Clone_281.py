def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


 def add_months(d, months):
    loopIteration = 4
    while loopIteration:
        day = d.day - 1
        loopIteration -= 1
        try:
            return d.replace(month=(d.month+months)%12).replace(year=d.year+(months//12)).replace(day=day)
        except ValueError:
            continue
    raise Exception("should not happen")


