package poly.edu.Java5_Lab3.controller;

import poly.edu.Java5_Lab3.model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    //Bài 1
    @RequestMapping("/detail")
    public String detail(Model model) {
        Staff staff = Staff.builder()
                .id("user@gmail.com")
                .fullname("nguyễn văn user")
                .level(2)
                .build();
        model.addAttribute("staff", staff);
        return "demo/staff-detail";
    }

    //Bài 2
    @RequestMapping("/list")
    public String list(Model model) {
        List<Staff> list = List.of(
                Staff.builder().id("user1@gmail.com").fullname("nguyễn văn user1").level(0).build(),
                Staff.builder().id("user2@gmail.com").fullname("nguyễn văn user2").level(1).build(),
                Staff.builder().id("user3@gmail.com").fullname("nguyễn văn user3").level(2).build(),
                Staff.builder().id("user4@gmail.com").fullname("nguyễn văn user4").level(2).build(),
                Staff.builder().id("user5@gmail.com").fullname("nguyễn văn user5").level(1).build(),
                Staff.builder().id("user6@gmail.com").fullname("nguyễn văn user6").level(0).build()
        );
        model.addAttribute("list", list);
        return "demo/staff-list";
    }

    // Bài 4
    @RequestMapping("/list-status")
    public String listStatus(Model model) {
        List<Staff> list = List.of(
                Staff.builder().id("user1@gmail.com").fullname("nguyễn văn user1").level(0).build(),
                Staff.builder().id("user2@gmail.com").fullname("nguyễn văn user2").level(1).build(),
                Staff.builder().id("user3@gmail.com").fullname("nguyễn văn user3").level(2).build(),
                Staff.builder().id("user4@gmail.com").fullname("nguyễn văn user4").level(2).build(),
                Staff.builder().id("user5@gmail.com").fullname("nguyễn văn user5").level(1).build(),
                Staff.builder().id("user6@gmail.com").fullname("nguyễn văn user6").level(0).build()
        );
        model.addAttribute("list", list);
        return "demo/list-status";
    }

    // Bài 5
    @RequestMapping("/list-controls")
    public String listControls(Model model) {
        List<Staff> list = List.of(
                Staff.builder().id("user1@gmail.com").fullname("nguyễn văn user1").level(0).build(),
                Staff.builder().id("user2@gmail.com").fullname("nguyễn văn user2").level(1).build(),
                Staff.builder().id("user3@gmail.com").fullname("nguyễn văn user3").level(2).build(),
                Staff.builder().id("user4@gmail.com").fullname("nguyễn văn user4").level(2).build(),
                Staff.builder().id("user5@gmail.com").fullname("nguyễn văn user5").level(1).build(),
                Staff.builder().id("user6@gmail.com").fullname("nguyễn văn user6").level(0).build()
        );
        model.addAttribute("list", list);
        return "demo/list-controls";
    }

//    @RequestMapping("/detail")
//    public String detail(Model model) {
//        // Không dùng Builder, dùng Constructor
//        Staff staff = new Staff("user@gmail.com", "nguyễn văn user", 2);
//
//        model.addAttribute("staff", staff);
//        return "demo/staff-detail";
//    }
//
//    // Bài 2: Hiển thị danh sách Staff
//    @RequestMapping("/list")
//    public String list(Model model) {
//        // Tạo danh sách Staff không dùng Builder
//        List<Staff> list = Arrays.asList(
//                new Staff("user1@gmail.com", "nguyễn văn user1", 0),
//                new Staff("user2@gmail.com", "nguyễn văn user2", 1),
//                new Staff("user3@gmail.com", "nguyễn văn user3", 2),
//                new Staff("user4@gmail.com", "nguyễn văn user4", 2),
//                new Staff("user5@gmail.com", "nguyễn văn user5", 1),
//                new Staff("user6@gmail.com", "nguyễn văn user6", 0)
//        );
//
//        model.addAttribute("list", list);
//        return "demo/staff-list";
//    }
//
//    // Bài 4: Hiển thị trạng thái
//    @RequestMapping("/list-status")
//    public String listStatus(Model model) {
//        List<Staff> list = Arrays.asList(
//                new Staff("user1@gmail.com", "nguyễn văn user1", 0),
//                new Staff("user2@gmail.com", "nguyễn văn user2", 1),
//                new Staff("user3@gmail.com", "nguyễn văn user3", 2),
//                new Staff("user4@gmail.com", "nguyễn văn user4", 2),
//                new Staff("user5@gmail.com", "nguyễn văn user5", 1),
//                new Staff("user6@gmail.com", "nguyễn văn user6", 0)
//        );
//
//        model.addAttribute("list", list);
//        return "demo/list-status";
//    }
//
//    // Bài 5: Hiển thị controls
//    @RequestMapping("/list-controls")
//    public String listControls(Model model) {
//        List<Staff> list = Arrays.asList(
//                new Staff("user1@gmail.com", "nguyễn văn user1", 0),
//                new Staff("user2@gmail.com", "nguyễn văn user2", 1),
//                new Staff("user3@gmail.com", "nguyễn văn user3", 2),
//                new Staff("user4@gmail.com", "nguyễn văn user4", 2),
//                new Staff("user5@gmail.com", "nguyễn văn user5", 1),
//                new Staff("user6@gmail.com", "nguyễn văn user6", 0)
//        );
//
//        model.addAttribute("list", list);
//        return "demo/list-controls";
//    }

}