#include <iostream>
using namespace std;
int main()
{
    double a[3][3];
    cout<<"Enter temperature for 3 floors and 3 rooms:"<<endl;
    for(int i=0;i<3;i++)
    {
        cout<<"Floor "<<i+1<<": ";
        for(int j=0;j<3;j++)
            cin>>a[i][j];
    }
    cout<<"Room1  Room2  Room3"<<endl;
    for(int i=0;i<3;i++)
    {
        cout<<"Floor "<<i+1<<" : ";
        for(int j=0;j<3;j++)
            cout<<a[i][j]<<"  ";
        cout<<endl;
    }
    double max=a[0][0];
    int floor=0,room=0;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            if(a[i][j]>max)
            {
                max=a[i][j];
                floor=i;
                room=j;
            }
        }
    }
    cout<<"Hottest Room : Floor "<<floor+1<<", Room "<<room+1<<" -> "<<max<<"C"<<endl;
    double maxavg=0;
    int hotfloor=0;
    for(int i=0;i<3;i++)
    {
        double sum=0;
        for(int j=0;j<3;j++)
            sum=sum+a[i][j];
        double avg=sum/3;
        if(i==0 || avg>maxavg)
        {
            maxavg=avg;
            hotfloor=i;
        }
    }
    cout<<"Hottest Floor : Floor "<<hotfloor+1<<" (avg "<<maxavg<<"C)"<<endl;
    int warning=0;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            if(a[i][j]>=30)
                warning++;
        }
    }
    cout<<"Rooms at WARNING or above : "<<warning<<endl;
    return 0;
}