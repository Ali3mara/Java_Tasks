package EWalletProj.Model;

public class Account {

    private String fullName;
    private String userName;
    private String password;
    private double balance;
    private String phoneNumber;
    private int age;


    //no arg account constructor, why? (Ask about it later)


    public Account(String fullName, String userName, String password,
                   double balance, String phoneNumber, int age) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public Account(String fullName, String userName, String password,
                   String phoneNumber, int age) {
        this(fullName, userName, password, 0.0, phoneNumber, age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean checkPassword(String password) {
        return this.password != null && this.password.equals(password);
    }

    @Override
    public String toString() {
        return "Account{" +
                "fullName='" + fullName + '\'' +
                ", userName='" + userName + '\'' +
                ", balance=" + balance +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}