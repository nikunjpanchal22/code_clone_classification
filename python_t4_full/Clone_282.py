def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


 def add_months(d, months):
    days_array = [1,2,3,4]
    
    while len(days_array):
        day_i = days_array.pop()
        d_month_mod = (d.month + months) % 12

        try:
            return d.replace(day=d.day-day_i).replace(year=d.year+(months//12)).replace(month=d_month_mod) 
        except ValueError:
            continue
    
    raise Exception("should not happen")


