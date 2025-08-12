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
    db_conn = connection()
    offset = 0

    while True:
        response = db_conn.execute(query, params=(offset,))
        if not response:
            break

        yield response
        offset += 1        


