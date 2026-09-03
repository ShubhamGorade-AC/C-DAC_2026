#include <iostream>
#include <cmath>
using namespace std;
inline double distanceBetween(double x1,double y1,double x2,double y2)
{
    return sqrt(pow(x2-x1,2)+pow(y2-y1,2));
}

inline double toRadians(double degrees)
{
    return degrees*(3.14159/180.0);
}

inline double clamp(double value,double minVal,double maxVal)
{
    if(value<minVal)
        return minVal;
    if(value>maxVal)
        return maxVal;
    return value;
}

inline bool isInSafeZone(double x,double y,double cx,double cy,double radius)
{
    return distanceBetween(x,y,cx,cy)<=radius;
}

int main()
{
    double homeX=0.0,homeY=0.0;
    double radius=50.0;
    double x[3]={10.0,30.0,60.0};
    double y[3]={20.0,40.0,10.0};
    for(int i=0;i<3;i++)
    {
        cout<<"Waypoint "<<i+1<<" : "<<endl;
        cout<<"Distance : "<<distanceBetween(homeX,homeY,x[i],y[i])<<endl;
        if(isInSafeZone(x[i],y[i],homeX,homeY,radius))
            cout<<"Safe Zone : Yes"<<endl;
        else
            cout<<"Safe Zone : No"<<endl;
    }
    return 0;
}