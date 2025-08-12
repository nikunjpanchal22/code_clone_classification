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





import pyodbc 

def func():
	sql = "SELECT * FROM table"
	conn = pyodbc.connect('DRIVER={ODBC Driver 17 for SQL Server};SERVER=test;DATABASE=test;UID=user;PWD=password')
	cur = conn.cursor()
	n = 0
	cur.execute(sql + " OFFSET " + str(n) + " ROWS FETCH NEXT 1 ROWS ONLY")
	ret = cur.fetchone()
	while ret:
		yield ret
		n += 1
		cur.execute(sql + " OFFSET " + str(n) + " ROWS FETCH NEXT 1 ROWS ONLY")


