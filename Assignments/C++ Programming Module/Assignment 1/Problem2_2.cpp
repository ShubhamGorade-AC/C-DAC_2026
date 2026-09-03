#include <iostream>
#include <cmath>
using namespace std;

double computeRMS(double* signal,int n)
{
    double sum=0;
    for(int i=0;i<n;i++)
        sum=sum+(*(signal+i)*(*(signal+i)));
    return sqrt(sum/n);
}

void normalise(double* signal,int n)
{
    double max=0;
    for(int i=0;i<n;i++)
    {
        if(fabs(*(signal+i))>max)
            max=fabs(*(signal+i));
    }
    for(int i=0;i<n;i++)
        *(signal+i)=*(signal+i)/max;
}

int countZeroCrossings(double* signal,int n)
{
    int count=0;
    for(int i=0;i<n-1;i++)
    {
        if((*(signal+i)>=0 && *(signal+i+1)<0) || (*(signal+i)<0 && *(signal+i+1)>=0))
            count++;
    }
    return count;
}
void applyGain(double* signal,int n,double gainFactor)
{
    for(int i=0;i<n;i++)
        *(signal+i)=*(signal+i)*gainFactor;
}
void display(double* signal,int n)
{
    for(int i=0;i<n;i++)
        cout<<*(signal+i)<<" ";
    cout<<endl;
}


int main()
{
    double signal[]={0.5,-1.2,0.8,-0.3,1.0,-0.9,0.1};
    int n=7;
    cout<<"Before : ";
    display(signal,n);
    cout<<"RMS : "<<computeRMS(signal,n)<<endl;
    cout<<"Zero Crossings : "<<countZeroCrossings(signal,n)<<endl;
    normalise(signal,n);
    cout<<"After Normalise : ";
    display(signal,n);
    applyGain(signal,n,2);
    cout<<"After Gain : ";
    display(signal,n);
    return 0;
}