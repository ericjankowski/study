collection = [12, 23, 34, 32, 45, 43, 56, 78, 76, 54, 32, 12, 23, 34, 45, 56, 67, 78, 89, 90, 9, 87, 76, 65, 54, 43, 32, 1]
target = raw_input("Enter a number to search for: ")
found = False
for x in collection:
	if str(x) == str(target) and found == False:
		print("Found " + str(target) + " in the collection")
		found = True
		break
if found == False:
	print(str(target) + " was not found in the collection")