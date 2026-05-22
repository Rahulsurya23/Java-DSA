int positive = 0;
int negative = 0;

for(int i = 0; i < n; i++){
    if(arr[i] > 0){
        positive++;
    }
    else if(arr[i] < 0){
        negative++;
    }
}

System.out.println("Positive: " + positive);
System.out.print("Negative: " + negative);
