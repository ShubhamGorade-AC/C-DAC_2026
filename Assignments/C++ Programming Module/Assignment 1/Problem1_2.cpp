#include <iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter number of readings : ";
    cin>>n;
    double a[100];
    cout<<"Enter "<<n<<" temperature readings : ";
    
    for(int i=0;i<n;i++)
        cin>>a[i];
    int skip=0;
    cout<<"Valid readings : ";
    for(int i=0;i<n;i++)
    {
        if(a[i]<0)
        {
            skip++;
            continue;
        }
        cout<<a[i]<<" ";
    }
    cout<<endl;
    cout<<"Skipped (errors) : "<<skip<<endl;
    
    for(int i=0;i<n;i++)
    {
        if(a[i]>=45)
        {
            cout<<"First CRITICAL : Index "<<i+1<<" -> "<<a[i]<<"C"<<endl;
            break;
        }
    }
    double min=0,max=0,sum=0;
    int count=0,normal=0,warning=0,critical=0,shutdown=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]<0)
            continue;
        if(count==0)
        {
            min=a[i];
            max=a[i];
        }
        if(a[i]<min)
            min=a[i];
        if(a[i]>max)
            max=a[i];
        sum=sum+a[i];
        count++;
        if(a[i]<30)
            normal++;
        else if(a[i]<40)
            warning++;
        else if(a[i]<50)
            critical++;
        else
            shutdown++;
    }
    cout<<"Min : "<<min<<"C"<<endl;
    cout<<"Max : "<<max<<"C"<<endl;
    cout<<"Avg : "<<sum/count<<"C"<<endl;
    cout<<"Normal: "<<normal<<" Warning: "<<warning<<" Critical: "<<critical<<" Shutdown: "<<shutdown<<endl;
    return 0;
}