def sierpinski(a, t, size) :
	if a == 0 :
		for i in range(3) :
			t.forward(size)
			t.left(120)
	else :
		sierpinski(a - 1, t, size / 2)
		t.forward(size / 2)
		sierpinski(a - 1, t, size / 2)
		t.forward(size / 2)
		t.left(120)
		t.forward(size / 2)
		sierpinski(a - 1, t, size / 2)
		t.forward(size / 2)
		t.left(120)
		t.forward(size)
		t.left(120)



 def sierpinski(a, t, size) :
    if a == 0:
		for _ in range(3):
			t.forward(size)
			t.left(120)
	else:
		sierpinski(a-1,t,size/2)
		t.forward(size/2)
		t.right(120)
		sierpinski(a-1,t,size/2)
		t.forward(size/2)
		t.right(120)
		sierpinski(a-1,t,size/2)
		t.forward(size/2)
		t.right(120)
		t.forward(size)
