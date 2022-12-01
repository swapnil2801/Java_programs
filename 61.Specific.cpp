#include<iostream>
using namespace std;

int Addi(int i,int j)
{
    int Ans = 0;
    Ans = i+j;
    return Ans;
}

float Addf(float i,float j)
{
    float Ans = 0;
    Ans = i+j;
    return Ans;
}


int main()
{
    int a = 10, b = 11, iRet = 0;
    float X = 90.0f, Y = 67.9f, fRet = 0.0f;

    iRet = Addi(a,b);
    fRet = Addf(X,Y);

    cout<<"Addition of Integers :"<<iRet<<"\n";
    cout<<"Addition of floats :"<<fRet<<"\n";


    return 0;
}