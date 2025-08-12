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
    sql = "select some rows"
    connection = open_connection()
    offset = 0
    cur = connection.cursor()
    cur.execute(sql, (offset,))
    row = cur.fetchone()
    while row:
        yield row
        offset += 1
        cur.execute(sql, (offset,))
        row = cur.fetchone()
    cur.close()
    connection.close()


