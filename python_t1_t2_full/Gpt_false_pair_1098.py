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


 def func():
    sql = " select some rows "
    dbconn = connection()
    n = 0
    response = execute(sql, n)

    while response is not None:
        yield response
        n += 1
        response = execute(sql, n)
    dbclose(dbconn)
