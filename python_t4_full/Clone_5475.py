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


	with open("C:\\Users\\username\\Desktop\\historyulrs.csv", 'w') as f:
		writer = csv.writer(f)
		writer.writerow(['URL', 'Title'])
		for row in crsr:
			writer.writerow(row)


 

def urls():
	import csv
	import sqlite3 as sql


