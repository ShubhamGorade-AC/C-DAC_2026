#include <iostream>
#include <memory>
using namespace std;

class Texture {
    int width;
    int height;
    string name;

    public:

    Texture() {
        cout<<"Default constuctor called"<<endl;
        int width = 0;
        int heigth = 0;
        string name = "";
    }

    Texture (int width, int height, string name) : width(width), 
    height(height), name(name) {
        cout<<"Prametrerized constuctor called"<<endl;
    }

    void display() {
        cout<<width<<endl;
        cout<<height<<endl;
        cout<<width<<endl;
    }

    ~Texture() {
        cout<<"Destructor called";
    }

};

int main() {
    unique_ptr <Texture> obj = make_unique <Texture> (10, 10, "shu");

    obj->display();

    unique_ptr<Texture> obj1 = move(obj);
    cout << "tex1 is null: " << (obj == nullptr ? "YES" : "NO") << endl;

    return 0;
}