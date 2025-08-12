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


		write.writerow(['URL', 'Title'])
		write.writerows(data)


 

def urls():
	import csv
	import sqlite3
	con = sqlite3.connect('C:\\Users\\username\\Desktop\\History.sql')
	cur = con.cursor()
	cur.execute('SELECT url, title FROM urls')	
	data = cur.fetchall()
	with open('C:\\Users\\username\\Desktop\\historyulrs.csv', 'w') as f:
		writer = csv.writer(f)


