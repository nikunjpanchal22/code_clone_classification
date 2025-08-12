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
    query = "select some rows"
    connection = create_connection()

    with connection.cursor() as cur:
        cursor.execute(query)
        result = cursor.fetchone()
        while result is not None:
            yield result
            result = cursor.fetchone()
    
    connection.close()


