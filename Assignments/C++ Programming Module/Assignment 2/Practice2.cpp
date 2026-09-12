#include <iostream>
using namespace std;

class Product {
    int id;
    public: string name;
    double price;
    int quantity;

    public :
    void accept() {
        cout<<"Enter the details : id, name, price, quanity of the product"<<endl;
        cin>>id>>name>>price>>quantity;
    }

    double total() const{
        return price*quantity;
    }

    void display() const{
        cout<<"Details of the product"<<endl;
        cout<<name<<" "<<price<<" "<<quantity<<" ";
        cout<<total()<<endl;
    }

    bool isLowStock(int threshold) const {
        return (quantity<=threshold);
    }
};

int main() {
    Product obj1[5];

    for(int i=0;i<5;i++) {
        obj1[i].accept();
    }

    for(int i=0;i<5;i++) {
        obj1[i].display();
    }

    for(int i=0;i<5;i++) {
        bool shu = obj1[i].isLowStock(10);
        if(shu==true) {
            cout<<"Low Stock (threshold: 10)"<<obj1[i].name<<endl;
        }
    }

    double max1=0;
    for(int i=0;i<5;i++) {
        double hi = obj1[i].total();
        if(hi>max1){
            max1=hi;
        }
    }
    cout<<"maximum product quantity is"<<max1<<endl;

}

