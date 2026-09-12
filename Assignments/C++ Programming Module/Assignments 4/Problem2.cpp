#include <iostream>
#include <string>
#include <vector>
#include <iomanip>
using namespace std;

class Vehicle {
protected:
    string registrationNo, ownerName;
    int yearOfManufacture;
    double kmDriven;

public:
    Vehicle(const string& reg, const string& owner, int year, double km) {
        registrationNo = reg;
        ownerName = owner;
        yearOfManufacture = year;
        kmDriven = km;

        cout << "[Vehicle Constructor] "
             << registrationNo << " : "
             << ownerName << endl;
    }

    virtual string vehicleType() const = 0;

    virtual double fuelCost(double kmToTravel) const = 0;

    virtual void describe() const {
        cout << "Registration: " << registrationNo << endl;
        cout << "Owner: " << ownerName << endl;
        cout << "Year: " << yearOfManufacture << endl;
        cout << "KM Driven: " << kmDriven << endl;
    }

    double getKmDriven() const {
        return kmDriven;
    }

    string getRegNo() const {
        return registrationNo;
    }

    string getOwnerName() const {
        return ownerName;
    }

    virtual ~Vehicle() {
        cout << "[Vehicle Destructor] "
             << registrationNo << endl;
    }
};

class Car : public Vehicle {
    string fuelType;
    double mileageKmpl;

public:
    Car(const string& reg, const string& owner, int year,
        double km, const string& fuel, double mileage)
        : Vehicle(reg, owner, year, km) {

        fuelType = fuel;
        mileageKmpl = mileage;

        cout << "[Car Constructor] "
             << registrationNo << endl;
    }

    string vehicleType() const override {
        return "Car";
    }

    double fuelCost(double kmToTravel) const override {
        double fuelPrice;

        if (fuelType == "Petrol")
            fuelPrice = 106.00;
        else
            fuelPrice = 93.00;

        return (kmToTravel / mileageKmpl) * fuelPrice;
    }

    void describe() const override {
        Vehicle::describe();

        cout << "Fuel Type: " << fuelType << endl;
        cout << "Mileage: " << mileageKmpl << " km/L" << endl;
    }

    ~Car() {
        cout << "[Car Destructor] "
             << registrationNo << endl;
    }
};

class Truck : public Vehicle {
protected:
    double payloadCapacityTons, fuelEfficiencyKmpl;

public:
    Truck(const string& reg, const string& owner, int year,
          double km, double payload, double efficiency)
        : Vehicle(reg, owner, year, km) {

        payloadCapacityTons = payload;
        fuelEfficiencyKmpl = efficiency;

        cout << "[Truck Constructor] "
             << registrationNo << endl;
    }

    string vehicleType() const override {
        return "Truck";
    }

    double fuelCost(double kmToTravel) const override {
        double efficiency =
            fuelEfficiencyKmpl *
            (1 - 0.05 * payloadCapacityTons);

        return (kmToTravel / efficiency) * 93.00;
    }

    void describe() const override {
        Vehicle::describe();

        cout << "Payload Capacity: "
             << payloadCapacityTons << " tons" << endl;

        cout << "Fuel Efficiency: "
             << fuelEfficiencyKmpl << " km/L" << endl;
    }

    ~Truck() {
        cout << "[Truck Destructor] "
             << registrationNo << endl;
    }
};

class ElectricTruck : public Truck {
    double batteryCapacityKWh, rangePerChargeKm;
    double batteryPercentage;

public:
    ElectricTruck(const string& reg, const string& owner, int year,
                  double km, double payload, double efficiency,
                  double battery, double range, double percentage)
        : Truck(reg, owner, year, km, payload, efficiency) {

        batteryCapacityKWh = battery;
        rangePerChargeKm = range;
        batteryPercentage = percentage;

        cout << "[ElectricTruck Constructor] "
             << registrationNo << endl;
    }

    string vehicleType() const override {
        return "Electric Truck";
    }

    double fuelCost(double kmToTravel) const override {
        return (kmToTravel / rangePerChargeKm)
               * batteryCapacityKWh
               * 9.50;
    }

    void describe() const override {
        Vehicle::describe();

        cout << "Battery Capacity: "
             << batteryCapacityKWh << " kWh" << endl;

        cout << "Range Per Charge: "
             << rangePerChargeKm << " km" << endl;

        cout << "Battery: "
             << batteryPercentage << "% charged" << endl;
    }

    double getBatteryPercentage() const {
        return batteryPercentage;
    }

    ~ElectricTruck() {
        cout << "[ElectricTruck Destructor] "
             << registrationNo << endl;
    }
};

class Van : public Vehicle {
    int seatingCapacity;
    double mileageKmpl;

public:
    Van(const string& reg, const string& owner, int year,
        double km, int seats, double mileage)
        : Vehicle(reg, owner, year, km) {

        seatingCapacity = seats;
        mileageKmpl = mileage;

        cout << "[Van Constructor] "
             << registrationNo << endl;
    }

    string vehicleType() const override {
        return "Van";
    }

    double fuelCost(double kmToTravel) const override {
        return (kmToTravel / mileageKmpl) * 106.00;
    }

    void describe() const override {
        Vehicle::describe();

        cout << "Seating Capacity: "
             << seatingCapacity << endl;

        cout << "Mileage: "
             << mileageKmpl << " km/L" << endl;
    }

    ~Van() {
        cout << "[Van Destructor] "
             << registrationNo << endl;
    }
};

void printFleetReport(const vector<Vehicle*>& fleet, double tripKm) {

    cout << "\n===== FLEET REPORT - Trip Distance: "
         << tripKm << " km =====" << endl;

    cout << left
         << setw(12) << "Reg"
         << setw(18) << "Type"
         << setw(22) << "Owner"
         << setw(12) << "Km Driven"
         << endl;

    cout << "------------------------------------------------------------"
         << endl;

    for (Vehicle* vehicle : fleet) {
        cout << left
             << setw(12) << vehicle->getRegNo()
             << setw(18) << vehicle->vehicleType()
             << setw(22) << vehicle->getOwnerName()
             << setw(12) << fixed << setprecision(0)
             << vehicle->getKmDriven()
             << endl;
    }

    cout << "\n===== FUEL / CHARGE COST ESTIMATE ====="
         << endl;

    double minimumCost = 1e9;
    Vehicle* mostEfficient = nullptr;

    for (Vehicle* vehicle : fleet) {

        double cost = vehicle->fuelCost(tripKm);

        cout << left
             << setw(12) << vehicle->getRegNo()
             << "(" << vehicle->vehicleType() << ")"
             << " : Rs. "
             << fixed << setprecision(2)
             << cost;

        ElectricTruck* electricTruck =
            dynamic_cast<ElectricTruck*>(vehicle);

        if (electricTruck != nullptr) {
            cout << "  [Battery: "
                 << electricTruck->getBatteryPercentage()
                 << "% charged]";
        }

        cout << endl;

        if (cost < minimumCost) {
            minimumCost = cost;
            mostEfficient = vehicle;
        }
    }

    cout << "\nMost Efficient Vehicle: "
         << mostEfficient->getRegNo()
         << " (" << mostEfficient->vehicleType() << ")"
         << " - Rs. "
         << fixed << setprecision(2)
         << minimumCost
         << " for "
         << tripKm << " km"
         << endl;
}

int main() {

    cout << "===== CONSTRUCTOR / DESTRUCTOR ORDER ====="
         << endl;

    {
        ElectricTruck et(
            "V-ET001",
            "Green Logistics",
            2025,
            50000,
            10,
            5.0,
            85,
            400,
            85
        );

        cout << "\nElectric Truck Details:" << endl;

        et.describe();

        cout << "\n...scope ends..." << endl;
    }

    cout << "\n===== POLYMORPHIC FLEET ====="
         << endl;

    vector<Vehicle*> fleet;

    fleet.push_back(
        new Car(
            "KA01AA001","Ramesh Kumar",2022,45200,"Petrol",18
        )
    );

    fleet.push_back(
        new Truck(
            "MH04BB002","Shyam Logistics",2020, 123500, 4, 6
        )
    );

    fleet.push_back(
        new ElectricTruck("GJ07CC003", "Green Fleet Co",2025,89000,5,5,85,400,85
        )
    );

    fleet.push_back(
        new Van(
            "DL08DD004","City Services",2023,67500, 8,15
        )
    );

    fleet.push_back(
        new Car(
            "MH12EE005","Ajay Transport",2021,78000,"Diesel",20
        )
    );

    double tripKm = 200;

    printFleetReport(fleet, tripKm);

    cout << "\n===== CLEANUP =====" << endl;

    for (Vehicle* vehicle : fleet) {
        delete vehicle;
    }

    return 0;
}