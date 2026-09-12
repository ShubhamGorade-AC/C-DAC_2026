#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

class Product
{
private:
    int productId;
    string name;
    double price;
    int quantity;

public:
    void acceptDetails()
    {
        cout<<"Enter Product ID: ";
        cin>>productId;
        cout<<"Enter Name: ";
        cin>>name;
        cout<<"Enter Price: ";
        cin>>price;
        cout<<"Enter Quantity: ";
        cin>>quantity;
    }

    void displayDetails() const
    {
        cout<<productId<<"\t"<<name<<"\t"<<price<<"\t"<<quantity<<"\t"<<totalValue();
        if(quantity<10)
            cout<<"\tLOW STOCK";
        cout<<endl;
    }

    double totalValue() const
    {
        return price*quantity;
    }

    bool isLowStock(int threshold) const
    {
        return quantity<threshold;
    }

    string getName() const
    {
        return name;
    }
};

double reorderCost(int qty,double unitPrice)
{
    return qty*unitPrice;
}

double reorderCost(double qty,double unitPrice)
{
    return qty*unitPrice;
}

double reorderCost(int qty,double unitPrice,double taxRate)
{
    double cost=qty*unitPrice;
    return cost+(cost*taxRate/100);
}

double applyDiscount(double price,double discountPercent=10.0)
{
    return price-(price*discountPercent/100);
}

int main()
{
    Product products[5];

    for(int i=0;i<5;i++)
        products[i].acceptDetails();

    cout<<endl;
    cout<<"===== INVENTORY REPORT ====="<<endl;
    cout<<"ID\tName\tPrice\tQty\tTotal Value"<<endl;

    for(int i=0;i<5;i++)
        products[i].displayDetails();

    int highest=0;

    for(int i=1;i<5;i++)
    {
        if(products[i].totalValue()>products[highest].totalValue())
            highest=i;
    }

    cout<<"Highest Value Product : "<<products[highest].getName()<<" (Rs. "<<products[highest].totalValue()<<")"<<endl;

    int threshold;
    cout<<"Enter low stock threshold: ";
    cin>>threshold;

    cout<<"Low Stock (threshold: "<<threshold<<") : ";

    for(int i=0;i<5;i++)
    {
        if(products[i].isLowStock(threshold))
            cout<<products[i].getName()<<" ";
    }

    cout<<endl;

    cout<<"Reorder Cost (int) : "<<reorderCost(10,50.0)<<endl;
    cout<<"Reorder Cost (double) : "<<reorderCost(10.5,50.0)<<endl;
    cout<<"Reorder Cost with Tax : "<<reorderCost(10,50.0,18.0)<<endl;
    cout<<"Discount with default : "<<applyDiscount(1000)<<endl;
    cout<<"Discount with custom : "<<applyDiscount(1000,20.0)<<endl;

    return 0;
}