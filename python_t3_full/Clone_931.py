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
    query_str = "select some rows"
    database = db_connection()
    start = 0
    result = database.retrieve_query(query_str,start)
    while result is not None :
        yield result
        start += 1
        result = database.retrieve_query(query_str,start)
    db_disconnection(database)


