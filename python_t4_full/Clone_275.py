def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


  def add_months(date, num_months):
    target_month = (date.month - 1 + num_months) % 12 + 1
    target_year = date.year + (date.month - 1 + num_months) // 12
    day = min(date.day,calendar.monthrange(target_year, target_month)[1])
    return date.replace(year = target_year, month = target_month, day = day)


