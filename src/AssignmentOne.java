// AssignmentOne.java
import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    
    public static void main(String[] args) {
        // Using classes and objects
        System.out.println("Using classes and objects");
        
        // 创建3个GP对象
        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Smith", "Family Medicine", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Johnson", "General Practice", true);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Brown", "Primary Care", false);
        
        // 创建2个心脏科医生对象
        Cardiologist card1 = new Cardiologist(201, "Dr. Wilson", "Cardiology", true);
        Cardiologist card2 = new Cardiologist(202, "Dr. Davis", "Cardiac Surgery", true);
        
        // 打印所有健康专业人员详情
        System.out.println("General Practitioners:");
        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        
        System.out.println("Cardiologists:");
        card1.printDetails();
        card2.printDetails();
        
        System.out.println("---");
        
        // Part 5 – Collection of appointments
        System.out.println("// Part 5 – Collection of appointments");
        
        // 创建预约
        createAppointment("John Doe", "0412345678", "09:00", gp1);
        createAppointment("Jane Smith", "0498765432", "10:30", gp2);
        createAppointment("Bob Wilson", "0432145698", "14:00", card1);
        createAppointment("Alice Brown", "0456789123", "15:30", card2);
        
        // 打印现有预约
        System.out.println("All Appointments:");
        printExistingAppointments();
        
        // 取消一个预约
        System.out.println("Cancelling appointment for mobile: 0498765432");
        cancelBooking("0498765432");
        
        // 再次打印预约
        System.out.println("Updated Appointments:");
        printExistingAppointments();
        
        System.out.println("---");
    }
    
    // 创建预约方法
    public static void createAppointment(String patientName, String mobilePhone, 
                                       String timeSlot, HealthProfessional doctor) {
        if (patientName != null && !patientName.isEmpty() &&
            mobilePhone != null && !mobilePhone.isEmpty() &&
            timeSlot != null && !timeSlot.isEmpty() &&
            doctor != null) {
            
            Appointment newAppointment = new Appointment(patientName, mobilePhone, timeSlot, doctor);
            appointments.add(newAppointment);
            System.out.println("Appointment created successfully for: " + patientName);
        } else {
            System.out.println("Error: All appointment information must be provided.");
        }
    }
    
    // 打印现有预约
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
            return;
        }
        
        System.out.println("Total appointments: " + appointments.size());
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println("Appointment " + (i + 1) + ":");
            appointments.get(i).printAppointmentDetails();
        }
    }
    
    // 取消预约
    public static void cancelBooking(String mobilePhone) {
        boolean found = false;
        Iterator<Appointment> iterator = appointments.iterator();
        
        while (iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if (appointment.getMobilePhone().equals(mobilePhone)) {
                iterator.remove();
                System.out.println("Appointment cancelled for mobile: " + mobilePhone);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Error: No appointment found for mobile: " + mobilePhone);
        }
    }
}