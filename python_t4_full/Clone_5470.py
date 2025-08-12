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


 

def urls():
	import csv
	import sqlite3
	conn = sqlite3.connect('C:\\Users\\username\\Desktop\\History.sql')
	curr = conn.cursor()
	curr.execute("SELECT url, title FROM urls")
	rows = curr.fetchall()
	conn.close()
	with open('C:\\Users\\username\\Desktop\\historyulrs.csv', mode='w', newline='') as file:
		writer = csv.writer(file)
		writer.writerow(["URL", "Title"])
		writer.writerows(rows)


