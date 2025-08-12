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



import sqlite3

def func():
	sql = "SELECT * FROM table"
	conn = sqlite3.connect('test.db')
	cur = conn.cursor()
	n = 0
	cur.execute(sql + " LIMIT 1 OFFSET " + str(n))
	ret = cur.fetchone()
	while ret:
		yield ret
		n += 1
		cur.execute(sql + " LIMIT 1 OFFSET " + str(n))
		ret = cur.fetchone()
	conn.close()


