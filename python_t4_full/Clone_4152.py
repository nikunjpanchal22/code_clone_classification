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


		try:
			ret = cursor.next()
		except StopIteration:
			break
	conn.close()


 
from cassandra.cluster import Cluster

def func():
    cluster = Cluster(['localhost'])
    session = cluster.connect('mydatabase')
    cur = session.execute("SELECT * FROM mytable LIMIT 1")


