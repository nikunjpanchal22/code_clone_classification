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
    connection = connect_db()
    offset = 0
    row = connection.fetch_one(query_str,offset)
    while row is not None :
        yield row
        offset += 1
        row = connection.fetch_one(query_str,offset)
    connection.disconnect()


