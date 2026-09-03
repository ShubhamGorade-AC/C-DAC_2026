#include <iostream>
#include <cstdlib>
using namespace std;
int main(int argc,char *argv[])
{
    if(argc!=4)
    {
        cout<<"Usage   : ./sensor_monitor"<<endl;
        cout<<"Error   : Missing arguments."<<endl;
        return 1;
    }
    int warn=atoi(argv[1]);
    int critical=atoi(argv[2]);
    int n=atoi(argv[3]);
    if(warn>=critical)
    {
        cout<<"Error   : Warn must be less than Critical."<<endl;
        return 1;
    }
    if(n<1 || n>500)
    {
        cout<<"Error   : Number of readings must be between 1 and 500."<<endl;
        return 1;
    }
    int normal=0,warning=0,criticalCount=0,shutdown=0;
    for(int i=0;i<n;i++)
    {
        int temp=rand()%70;
        if(temp<warn)
            normal++;
        else if(temp<critical)
            warning++;
        else if(temp<60)
            criticalCount++;
        else
            shutdown++;
    }
    cout<<"Config  : Warn="<<warn<<"C  Critical="<<critical<<"C  Readings="<<n<<endl;
    cout<<"Results : Normal:"<<normal<<"  Warning:"<<warning<<"  Critical:"<<criticalCount<<"  Shutdown:"<<shutdown<<endl;
    return 0;
}