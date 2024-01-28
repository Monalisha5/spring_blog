package org.jt.implementationspringboot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CardController {

    @GetMapping("/home")
    public String displayPage(Model model) {

        // List<Student> detailsList = new ArrayList<>();

        // detailsList.add(new Student("Sravani Nayak", "09/05/2023", "Java Fullstack",30000.98));
        // detailsList.add(new Student("Monalissha Sahoo", "09/05/2023","Java Fullstack" ,30000.98));
        // detailsList.add(new Student("Atiba Anwar", "09/05/2023","Java Fullstack" ,30000.98));

        // // Add the list to the model
        // model.addAttribute("detailsList", detailsList);

        return "home";
    }

     @GetMapping("/student_details")
    public String displayStudentDetails(Model model) {
        
        List<Student> detailsList = new ArrayList<>();
        detailsList.add(new Student("Sravani Nayak", "09/05/2023", "Java Fullstack", "BBSR"));
        detailsList.add(new Student("Monalissha Sahoo", "09/05/2023", "Java Fullstack", "CTC"));
        detailsList.add(new Student("Atiba Anwar", "09/05/2023", "Java Fullstack", "BBSR"));
        model.addAttribute("detailsList", detailsList);
        return "student_details";
    }
}

        


