def urls() :
	conn = sqlite3.connect('C:\Users\username\Desktop\History.sql')
	c = conn.cursor()
	query = "SELECT url, title FROM urls"
	c.execute(query)
	data = c.fetchall()
	if data :
		with open("C:\Users\username\Desktop\\historyulrs.csv", 'w') as outfile :
			writer = csv.writer(outfile)
			writer.writerow(['URL', 'Title'])
			for entry in data :
				writer.writerow([str(entry [0]), str(entry [1])])


#9. Using Pandas to_excel
def urls() :
    import pandas as pd
    conn = sqlite3.connect('C:\Users\username\Desktop\History.sql')
    df = pd.read_sql_query("SELECT url, title FROM urls", conn)
    df.to_excel('C:\Users\username\Desktop\\historyulrs.xlsx', index=False, header=['URL', 'Title'])


