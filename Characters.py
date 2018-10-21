c=input()
a={'a','e','i','o','u','A','E','I','O','U'}
b={'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X','Z',
'b','c','d','f','g','h','j','k','l','m','n','p','r','s','t','v','w','x','y','z'}
if c in a:
	print("Vowel")
elif c in b:
	print("Consonant")
else:
	print("Invalid")
	
