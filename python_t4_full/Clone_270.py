def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


  def add_months(date,num_months):
    month = date.month - 1
    target_month = month + num_months
    year = date.year + (target_month / 12)
    month = target_month % 12 + 1
    max_day = calendar.monthrange(year,month)[1]
    day = min(date.day,max_day)
    return date.replace(year=year, month=month, day=day)


