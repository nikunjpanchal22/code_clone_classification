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


		ret = cur.fetchone()
	conn.close()



import pyhdb

def func():
	sql = "SELECT * FROM table"
	conn = pyhdb.connect(host="hostname", port=30015, user="SYSTEM", password="secret")
	cur = conn.cursor()
	n = 0
	cur.execute(sql + " LIMIT 1 OFFSET " + str(n))
	ret = cur.fetchone()
	while ret:
		yield ret


