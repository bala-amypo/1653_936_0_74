package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity{
   //  @Id
   //  @GeneratedValue(strategy = GenerationType.IDENTITY)
   //  private Long id;
   //  @NotNull
   //  @Size(min = 2, max = 10, message = "must be 2 to 10 character")
   //  private String username;
   //  @Email(message = "Email is not valid")
   //  private String email;
   //  @Size(min=6, max = 100)
   //  @NotNull(message  = "Password is mandatory")
   //  private String password;
   //  @Min(18)
   //  @Positive(message = "Age must be greater than or equal to 18")
   //  private int age;
    
   //  public ValidationEntity(long id,
   //     @NotNull
   //  @Size(min = 2, max = 0, message = "must be 2 to 10 character") String username,
   //   @Email(message = "Email is not valid") String email,
   //      @Size(min=6, max = 100) @NotNull(message  = "Password is mandatory") String password,
   //       @Min(18) @Positive(message = "Age must be greater than or equal to 18") int age ){
   //       this.id = id;
   //       this.username = username;
   //       this.email = email;
   //       this.password = password;
   //       this.age = age;
   //       }
   //       public ValidationEntity(){

   //       }
   //       public Long getId(){
   //          return id;
   //       }
   //       public String getUserName(){
   //          return username;
   //       }
   //       public String getEmail(){
   //          return email;
   //       }
   //       public String getPassword(){
   //          return password;
   //       }
   //       public Integer getAge(){
   //          return age;
   //       }
   //       public void setId(Long id){
   //          this.id = id;
   //       }
   //       public void setUsername(String username){
   //          this.username = username;
   //       }
   //        public void setEmail(String email){
   //          this.email = email;
   //       }
         
   //       public void setPassword(String password){
   //          this.password = password;
   //       }
   //       public void setAge(Integer age){
   //          this.age = age;
   //       }

}
