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


import psycopg2

def func():
	sql = "SELECT * FROM table"
	conn = psycopg2.connect('dbname=testdb user=postgres password=secret')
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



