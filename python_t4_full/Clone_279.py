def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


 def add_months(d, months):
    add_year = int(months / 12)
    add_month = months % 12
    new_year = d.year + add_year
    new_month = d.month + add_month
    new_day = d.day

    while True:
        try:
            return d.replace(year=new_year, month=new_month, day=new_day) 
        except:
            new_day -= 1
            continue
    raise Exception("should not happen")


