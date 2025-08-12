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


		n += 1
		cur.execute(sql + " OFFSET " + str(n) + " LIMIT 1")
		ret = cur.fetchone()
	conn.close()



from pymongo import MongoClient

def func():
	conn = MongoClient('localhost', 27017)
	db = conn.test
	cursor = db['table'].find().skip(n).limit(1)
	ret = cursor.next()
	while ret:
		yield ret
		n += 1


