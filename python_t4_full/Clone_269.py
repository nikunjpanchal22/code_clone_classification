def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


  def add_months(date, n_months):
    if n_months < 0:
        raise ValueError("No negative months!")        
    else:
        _, days_in_month = calendar.monthrange(date.year , date.month)
        day = min(date.day, days_in_month)
        target_month = (date.month + n_months - 1) % 12 + 1
        target_year = date.year + (date.month + n_months -1 ) // 12
        return date.replace(year=target_year, month=target_month, day=day)


