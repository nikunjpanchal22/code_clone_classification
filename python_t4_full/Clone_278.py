def add_months(d, months) :
	for i in range(4) :
		day = d.day - i
		try :
			return d.replace(day = day).replace(year = d.year + int(months) / / 12).replace(month = (d.month + int(months)) % 12)
		except :
			pass
	raise Exception("should not happen")


 def add_months(d, months):
    if (d.month + months) % 12 == 0:
        d = d.replace(day=d.day-1).replace(month=12).replace(year=d.year + int(months/12) - 1)
    else:
        d = d.replace(day=d.day-1).replace(month=(d.month + months) % 12).replace(year = d.year + int(months/12))

    try:
        return d
    except ValueError:
        try:
            d = d.replace(day=d.day-2)
            return d
        except ValueError:
            try:
                d = d.replace(day = d.day-3)
                return d
            except ValueError:
                raise Exception("should not happen")


