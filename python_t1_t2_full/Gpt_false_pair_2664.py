def func() :
	sql = " select some rows "
	dbconn = "connect and open to dtabase code"
	n = 0
	ret = execute(sql, n)
	while ret is not None :
		yield ret
		n += 1
		ret = execute(sql, n)
	dbclose()




def func() :
	sql = " select some rows "
	dbconn = "connect and open to dtabase code"
	for i in range(0, len(dbconn)):
		ret = execute(sql, i)
		while ret is not None :
			yield ret
			i += 1
			ret = execute(sql, i)
	dbclose()

