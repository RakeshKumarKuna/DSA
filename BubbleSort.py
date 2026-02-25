class BubbleSort:
    def __init__(self,arr):
        self.arr=arr

    def bubbleSort(self):
        for i in range(len(self.arr)-1):
            flag=0
            for j in range((len(self.arr))-1-i):
                if(self.arr[j]>self.arr[j+1]):
                    self.arr[j],self.arr[j+1]=self.arr[j+1],self.arr[j]
                if(flag==0):
                    break
        return self.arr
   
obj=BubbleSort([5,4,8,9,4,6]);
print(obj.bubbleSort())