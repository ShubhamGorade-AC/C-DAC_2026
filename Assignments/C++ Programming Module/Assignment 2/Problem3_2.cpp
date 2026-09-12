#include <iostream>
using namespace std;
namespace Physics
{
    double clamp(double val,double min,double max)
    {
        if(val<min)
            return min;
        if(val>max)
            return max;
        return val;
    }

    double lerp(double a,double b,double t)
    {
        return a+(b-a)*t;
    }
}
namespace GameMath
{
    int clamp(int val,int min,int max)
    {
        if(val<min)
            return min;
        if(val>max)
            return max;
        return val;
    }

    double lerp(double a,double b,double t)
    {
        return a+(b-a)*t;
    }
}
int main()
{
    double velocity=Physics::clamp(120.5,0,100);
    int health=GameMath::clamp(120,0,100);
    cout<<"Physics Clamp : "<<velocity<<endl;
    cout<<"GameMath Clamp : "<<health<<endl;
    cout<<"Physics Lerp : "<<Physics::lerp(10,50,0.5)<<endl;
    cout<<"GameMath Lerp : "<<GameMath::lerp(0,100,0.25)<<endl;
    {
        using namespace Physics;
        cout<<"Limited Scope Clamp : "<<clamp(150.0,0,100)<<endl;
        cout<<"Limited Scope Lerp : "<<lerp(10,50,0.5)<<endl;
    }
    return 0;
}