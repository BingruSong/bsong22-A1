// Appointment.java
public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional doctor; // 使用基类类型，支持多态
    
    // 默认构造函数
    public Appointment() {
        this.patientName = "Unknown";
        this.mobilePhone = "Unknown";
        this.timeSlot = "Unknown";
        this.doctor = null;
    }
    
    // 带参数的构造函数
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }
    
    // 打印预约详情
    public void printAppointmentDetails() {
        System.out.println("Patient: " + patientName);
        System.out.println("Mobile: " + mobilePhone);
        System.out.println("Time: " + timeSlot);
        System.out.println("Doctor: ");
        if (doctor != null) {
            doctor.printDetails();
        } else {
            System.out.println("No doctor assigned");
        }
        System.out.println("================================");
    }
    
    // Getter 方法
    public String getPatientName() { return patientName; }
    public String getMobilePhone() { return mobilePhone; }
    public String getTimeSlot() { return timeSlot; }
    public HealthProfessional getDoctor() { return doctor; }
}