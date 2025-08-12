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




import MySQLdb

def func():
	sql = "SELECT * FROM table"
	db = MySQLdb.connect("localhost","testuser","test123","TESTDB" )
	cursor = db.cursor()
	n = 0
	cursor.execute(sql + " LIMIT 1 OFFSET " + str(n))
	ret = cursor.fetchone()
	while ret:
		yield ret
		n += 1
		cursor.execute(sql + " LIMIT 1 OFFSET " + str(n))
		ret = cursor.fetchone()


