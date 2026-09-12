#include <iostream>
using namespace std;
int main()
{
    int r,c;
    cout<<"Enter rows : ";
    cin>>r;
    cout<<"Enter columns : ";
    cin>>c;

    int** map=new int*[r];

    for(int i=0;i<r;i++)
        map[i]=new int[c];
    cout<<"Enter tile values (0-4):"<<endl;

    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
            cin>>map[i][j];
    }
    cout<<"===== GAME MAP ("<<r<<" x "<<c<<") ====="<<endl;

    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
            cout<<map[i][j]<<"  ";
        cout<<endl;
    }
    cout<<"Legend: 0=Grass  1=Water  2=Mountain  3=Forest  4=Dungeon"<<endl;
    int count[5]={0};

    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(map[i][j]>=0 && map[i][j]<=4)
                count[map[i][j]]++;
        }
    }

    cout<<"Tile Count:"<<endl;
    cout<<"Grass    : "<<count[0]<<endl;
    cout<<"Water    : "<<count[1]<<endl;
    cout<<"Mountain : "<<count[2]<<endl;
    cout<<"Forest   : "<<count[3]<<endl;
    cout<<"Dungeon  : "<<count[4]<<endl;
    
    for(int i=0;i<r;i++)
        delete[] map[i];
    delete[] map;
    return 0;
}