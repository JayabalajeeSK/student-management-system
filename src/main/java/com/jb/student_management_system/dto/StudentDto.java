package com.jb.student_management_system.dto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty(message = "Student first name should not be empty")
    private String firstName;
    @NotEmpty(message = "Student last name should not be empty")
    private String lastName;
    @NotEmpty(message = "Student email should not be empty")
    @Email(message = "Invalid email format")
    // @Pattern(
    // regexp = "^(?!\\.)([a-zA-Z._%+-]+)@[a-zA-Z0-9.-]+\\.(com|org|net|edu|gov|mil|int|info|biz|co|in|us|uk|au|ca|de|fr|jp){1}$",
    // message = "Example: jayabalajeesk04@gmail.com"
    // )
    private String email;
}