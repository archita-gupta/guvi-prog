a=list(map(int,input().split()))
arr=list(map(int,input().split()))
k=a[-1]
s=0
for i in range(0,k):
    s+=arr[i]
print(s)
