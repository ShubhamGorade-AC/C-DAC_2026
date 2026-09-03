#include <iostream>
using namespace std;

int main() {
    double tempre;
    cout<<"Enter the tempreture in degree celcius"<<endl;
    cin>>tempre;

    double fah = (tempre*9/5)+32;
    cout<<"Tempreture : "<<tempre<<"C"<<" / "<<fah<<"F"<<endl;

    int statuscode;
    if(tempre<0) {
        statuscode=-1;
    }
    else if(tempre<=29 && tempre>=0) {
        statuscode=0;
    }
    else if(tempre<=44 && tempre>=30) {
        statuscode=1;
    }
    else if(tempre=59 && tempre>=45) {
        statuscode=2;
    }
    else if(tempre>=60) {
        statuscode=3;
    }

    switch(statuscode) {
        case -1 : 
            cout<<"Status"<<"     : "<<"SENSOR_ERROR"<<endl;
            cout<<"Action     : Sensor fault - check wiring"<<endl;
            break;

        case 0 : 
            cout<<"Status"<<"     : "<<"NORMAL"<<endl;
            cout<<"Action     : No action required"<<endl;
            break;
        
        case 1 : 
            cout<<"Status"<<"     : "<<"WARNING"<<endl;
            cout<<"Action     : Alert sent to supervisor"<<endl;
            break;
        
        case 2 : 
            cout<<"Status"<<"     : "<<"CRITICAL"<<endl;
            cout<<"Action     : Cooling sysyem triggered"<<endl;
            break;

        case 3 : 
            cout<<"Status"<<"     : "<<"SHUTDOWN"<<endl;
            cout<<"Action     : Emergency shutdown initiated"<<endl;
            break;
    }

    int average = 25;
    string result = (tempre<25)?"Reading    : Below Average" : (tempre>25)?"Reading    : Above Average" : "Reading    : Average";
    cout<<result<<endl;
    
    return 0;
}