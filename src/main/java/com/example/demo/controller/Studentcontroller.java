






import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class StudentController{
    @Autowired Studentservice service;
    @PostMapping("/post")
    public StudentEntity postval(@RequestBody StudentEntity entity){
        return service
    }
}