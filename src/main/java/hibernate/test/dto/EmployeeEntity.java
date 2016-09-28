package hibernate.test.dto;

import org.hibernate.annotations.OptimisticLockType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@org.hibernate.annotations.Entity(optimisticLock = OptimisticLockType.ALL, dynamicUpdate = true)
@Table(name = "Employee", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = "EMAIL")})
public class EmployeeEntity implements Serializable{

    private static final long serialVersionUID = -3005926375540403894L;

    private long employeeId;
    private String email;
    private String firstName;
    private String lastName;

    public EmployeeEntity() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long id) {
        this.employeeId = id;
    }
    @Column(name = "EMAIL", unique = true, nullable = false, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firtsName) {
        this.firstName = firtsName;
    }

    @Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
