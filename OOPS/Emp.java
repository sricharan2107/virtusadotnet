import java.util.*;


class Details{
    int id, sal, yearOfExperience;
    long mobileNumber;
    String name, DOB, gender, address;

    public Details(int id, String name, String gender, Long mobileNumber, String DOB, int sal, int yearOfExperience, String address){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.DOB = DOB;
        this.sal = sal;
        this.yearOfExperience = yearOfExperience;
        this.address = address;
    }
}


class Emp{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList <Details> emp = new ArrayList<Details>();
        int id, sal, yearOfExperience,s_id,count = 0,co;
        long mobileNumber;
        String name, DOB, gender, address;
        boolean f = true;
        
        System.out.println("Menu");

        System.out.println("1. Add Employee Details\n2. View Single Employee Details\n3. View All Employee Details\n4. Update Employee Details\n5. Delete Employee Details\n6. exit");

        while(f){
            System.out.print("Enter your choice : ");
            int n = sc.nextInt();
            boolean flag = false;
            switch(n){
                case 1 :
                    System.out.println("Enter the details\n");
                    System.out.print("Enter ID : ");
                    id = sc.nextInt();

                    System.out.print("Enter Name : ");
                    name = sc.next();

                    System.out.print("Enter Gender (M/F/O) : ");
                    gender = sc.next();

                    System.out.print("Enter Mobile Number : ");
                    mobileNumber = sc.nextLong();

                    System.out.print("Enter DOB(DD/MM/YYYY) : ");
                    DOB = sc.next();

                    System.out.print("Enter Salary : ");
                    sal = sc.nextInt();

                    System.out.print("Enter the Expereince : ");
                    yearOfExperience = sc.nextInt();

                    System.out.print("Enter the address : ");
                    address = sc.next();

                    emp.add(new Details(id, name, gender, mobileNumber, DOB, sal, yearOfExperience, address));

                    count++;
                    System.out.println("Employee Details added sucessfully !");
                    break;

                case 2 :
                    
                    System.out.print("Enter the ID number : ");
                    s_id = sc.nextInt();
                    System.out.println("________________________________________________________________________________________________");
                    System.out.println("|ID\t|NAME\t|GENDER\t|MOBILE NUMBER\t|DOB\t\t|SALARY\t|EXPERIENCE\t|ADDRESS\t|");
                    System.out.println("________________________________________________________________________________________________");
                    for(Details d : emp){
                        if(s_id == d.id){
                            System.out.println("|"+d.id+"\t|"+d.name+"\t|"+d.gender+"\t|"+d.mobileNumber+"\t|"+d.DOB+"\t|"+d.sal+"\t|"+d.yearOfExperience+"\t\t|"+d.address+"\t\t|");
                            System.out.println("________________________________________________________________________________________________");
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        System.out.println("Incorrect ID, PLEASE ENTER CORRECT ID ");
                    }
                    break;

                case 3 :
                    System.out.println("The List of the employees are : ");
                    System.out.println("________________________________________________________________________________________________");
                    System.out.println("|ID\t|NAME\t|GENDER\t|MOBILE NUMBER\t|DOB\t\t|SALARY\t|EXPERIENCE\t|ADDRESS\t|");
                    System.out.println("________________________________________________________________________________________________");
                    for(Details d : emp){
                        System.out.println("|"+d.id+"\t|"+d.name+"\t|"+d.gender+"\t|"+d.mobileNumber+"\t|"+d.DOB+"\t|"+d.sal+"\t|"+d.yearOfExperience+"\t\t|"+d.address+"\t\t|");
                        System.out.println("________________________________________________________________________________________________");
                    }
                    break;

                case 4 :
                    System.out.println("Enter the Employee ID : ");
                    s_id = sc.nextInt();

                    for(Details d : emp){
                        if(s_id == d.id){
                            System.out.println("Menu");
                            System.out.println("1.Name\n2.Gender\n3.Mobile Number\n4.DOB\n5.Salary\n6.Years Of Experience\7.Address");
                            System.out.print("Enter the option that you want to edit : ");
                            int opt = sc.nextInt();
                            String a;
                            int b;
                            long c;
                            switch(opt){
                                case 1:
                                    System.out.print("Enter the updated name : ");
                                    a = sc.next();
                                    d.name = a;
                                    break;
                                case 2:
                                    System.out.print("Enter the updated Gender : ");
                                    a = sc.next();
                                    d.gender = a;
                                    break;
                                case 3:
                                    System.out.print("Enter the updated Mobile Number : ");
                                    c = sc.nextLong();
                                    d.mobileNumber = c;
                                    break;
                                case 4:
                                    System.out.print("Enter the updated DOB : ");
                                    a = sc.next();
                                    d.DOB = a;
                                    break;
                                case 5:
                                    System.out.print("Enter the updated Salary : ");
                                    b = sc.nextInt();
                                    d.sal = b;
                                    break;
                                case 6:
                                    System.out.print("Enter the updated Years of Experience : ");
                                    b = sc.nextInt();
                                    d.yearOfExperience = b;
                                    break;
                                case 7:
                                    System.out.print("Enter the updated Address : ");
                                    a = sc.next();
                                    d.address = a;
                                    break;
                            }
                            flag = true;
                            break;
                        }
                        
                    }
                    if(!flag){
                        System.out.println("Incorrect ID, PLEASE ENTER CORRECT ID ");
                    }
                    break;

                case 5 :
                    System.out.print("Enter the Employee ID to be deleted : ");
                    s_id = sc.nextInt();
                    co = 0;
                    for(Details d : emp){
                        if(s_id == d.id ){
                            emp.remove(d);
                            count--;
                            flag = true;
                            break;
                        }
                    }
                    if(!flag){
                        System.out.println("Incorrect ID, PLEASE ENTER CORRECT ID ");
                    }else{
                        System.out.println("Employee Details deleted successfully");
                    }
                    break;

                case 6 :
                    f = false;
                    break;
                default:
                    System.out.println("Enter the correct option from the menu");
            }
        }
    }
}