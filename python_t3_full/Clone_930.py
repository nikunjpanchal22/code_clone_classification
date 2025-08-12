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
     database = connect_database()
     pos = 0
     data = database.fetch_by_position(query,pos)
     while data is not None:
          yield data
          pos += 1
          data = database.fetch_by_position(query,pos)
     database.disconnect()


