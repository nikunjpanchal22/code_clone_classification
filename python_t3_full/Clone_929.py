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
    sql_query= "select some rows"
    cursor = create_cursor()
    count = 0
    retrieved_data = cursor.fetchone(sql_query, count)
    while retrieved_data is not None :
        yield retrieved_data
        count += 1
        retrieved_data = cursor.fetchone(sql_query, count)
    close_cursor(cursor)


