def rec(chk, i) :
	print (locals())
	i += 1
	chk = chk + [i]
	if i != 4 :
		rec(chk, i)
		print (locals())


 def rec(chk, i) :
      print ("Entering")
      print (locals())
      i += 1
      chk = chk + [i]
      if i != 4 :
            rec(chk, i)
            print ("Leaving")
            print (locals())
