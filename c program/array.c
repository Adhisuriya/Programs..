#include<stdio.h>
int main(){
int a[5],temp,b[5],c[5],j=1;
for(int i=0; i<5; i++){
    scanf("%d",&a[i]);
}
for(int i=0; i<5; i++){
    if(a[i]%2==0){
        b[i]=a[i];
    }else{
        c[i] =a[i];
    }}
//odd to asendeing
for(int i=0; i<5; i++){
    if(b[i]>b[j]){
        temp=b[i];
        b[i] =b[j];
        b[j]=temp;
    }
}

for(int i=0; i<3; i++){
    printf("%d ",b[i]);
}

return 0;
}
