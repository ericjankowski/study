collection = [12, 23, 34, 32, 45, 43, 56, 78, 76, 54, 32, 12, 23, 34, 45, 56, 67, 78, 89, 90, 9, 87, 76, 65, 54, 43, 32, 1]
min = collection[0]
max = collection[0]
for x in collection:
	if x > max:
		max = x
	if x < min:
		min = x
print("Min = " + str(min))
print("Max = " + str(max))