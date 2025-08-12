def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


 def add_months(d, months):
    year_add = int(months / 12)
    required_month_add = months % 12

    d = d.replace(year = d.year + year_add) 
    d = d.replace(month = d.month + required_month_add)

    if d.day > 31: 
        d = d.replace(day = 30)
    
    try: 
        return d
    except:
        raise Exception("should not happen")


