name1=input("enter your name")
name2=input("enter your crush name")
str="flames"
list1= []
list2= []
list3=[]
list4=[]
length=len(str)
ch1=len(name1)
ch2=len(name2)

for i in name1:
    list3.append(i)
for i in name2:
    list4.append(i)
for i in name1:
    if name1.count(i) >1 :
        list1.append(i)
for i in name2:
    if name2.count(i) >1 :
        list2.append(i)
for i in range(0,len(list1)):
    for j in range(0,len(list3)):
        for k in range(0,len(list4)):
            if list1[i]==list3[j] and list1[i]==list4[k]:
                for l in range(j,len(list3)):
                    list3[l]=''
                    break
                for m in range(k,len(list4)):
                    list4[m]=''
                    break
for i in range(0,len(list2)):
    for j in range(0,len(list3)):
        for k in range(0,len(list4)):
            if list2[i]==list3[j] and list2[i]==list4[k]:
                for l in range(j,len(list3)):
                    list3[l]=''
                    break
                for m in range(k,len(list4)):
                    list4[m]=''
                    break
c=0
for i in range(0,len(list3)):
    for j in range(0,len(list4)):
        if list3[i]==list4[j]:
            list3[i]=''
            list4[j]=''
for i in range(0, len(list3)):
        if list3[i]!='':
            c=c+1
for i in range(0, len(list4)):
        if list4[i]!='':
            c=c+1
f=6
num=0
for i in range(1,6):
    if c>i:
        num=c-i
    else:
        num=c
    while(num>i):
        num=num-i
flames=['friends','lovers','affection','marriage','enemies','siblings']
while(len(flames)!=1):
    split_index = (c % len(flames) - 1)
    if split_index >=0:
        right = flames[split_index+1:]
        left = flames[: split_index]
        flames = right + left
    else:
        flames = flames[ :len(flames)-1]
print("relationship between you two is",flames[0])
