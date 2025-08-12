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


	conn.close()



import cx_Oracle

def func():
	sql = "SELECT * FROM table"
	conn = cx_Oracle.connect('user/password@localhost')
	cur = conn.cursor()
	n = 0
	cur.execute(sql + " OFFSET :n ROWS FETCH NEXT 1 ROWS ONLY", n=n)
	ret = cur.fetchone()
	while ret:
		yield ret
		n += 1


