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
     database = open_database()
     ii = 0
     query_response = database.execute(query,params=(ii,))
     while query_response is not None:
          yield query_response
          ii +=1
          query_response = database.execute(query,params=(ii,))
     database.close()


