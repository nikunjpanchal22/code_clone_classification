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
    param_sql = "select some rows"
    dbconn = connection()
    offset = 0
    execute_query = execute(param_sql, offset)
    while execute_query is not None:
        yield execute_query
        offset +=1
        execute_query = execute(param_sql, offset)
    close_connection(dbconn)
