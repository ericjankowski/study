def binary_search(target, low_index, hi_index, collection):
	print("hi: " + str(hi_index) + " low: " + str(low_index))
	midpoint = (low_index + hi_index)/2
	if collection[midpoint] == target:
		return True
	elif midpoint == low_index or midpoint == hi_index:
		return False
	elif target > collection[midpoint]:
		return binary_search(target, midpoint, hi_index, collection)
	elif target < collection[midpoint]:
		return binary_search(target, low_index, midpoint, collection)

target = int(raw_input("What number are you looking for? "))
collection =    [1, 5, 6, 9, 10, 11, 13, 21, 22, 23, 
				33, 34, 35, 44, 45, 46, 55, 56, 57, 66, 
				67, 68, 77, 78, 79, 88, 89, 99, 111, 112, 
				113, 122, 125, 126, 135, 136, 137, 145, 156, 167, 
				222, 223, 224, 234, 245, 256, 267, 278, 289, 290, 
				333, 334, 335, 345, 346, 356, 356, 378, 378, 389]

if binary_search(target, 0, len(collection), collection):
	print(str(target) + " was found in the collection")
else:
	print(str(target) + " was not found in the collection")




